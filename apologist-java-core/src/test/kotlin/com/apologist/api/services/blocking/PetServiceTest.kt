// File generated from our OpenAPI spec by Stainless.

package com.apologist.api.services.blocking

import com.apologist.api.TestServerExtension
import com.apologist.api.client.okhttp.ApologistOkHttpClient
import com.apologist.api.models.pet.Pet
import com.apologist.api.models.pet.PetFindByStatusParams
import com.apologist.api.models.pet.PetFindByTagsParams
import com.apologist.api.models.pet.PetUpdateWithFormParams
import com.apologist.api.models.pet.PetUploadImageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PetServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            ApologistOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petService = client.pet()

        val pet =
            petService.create(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Pet.Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            ApologistOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petService = client.pet()

        val pet = petService.retrieve(0L)

        pet.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            ApologistOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petService = client.pet()

        val pet =
            petService.update(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Pet.Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            ApologistOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petService = client.pet()

        petService.delete(0L)
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun findByStatus() {
        val client =
            ApologistOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petService = client.pet()

        val pets =
            petService.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun findByTags() {
        val client =
            ApologistOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petService = client.pet()

        val pets = petService.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateWithForm() {
        val client =
            ApologistOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petService = client.pet()

        petService.updateWithForm(
            PetUpdateWithFormParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun uploadImage() {
        val client =
            ApologistOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petService = client.pet()

        val response =
            petService.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .body("some content")
                    .build()
            )

        response.validate()
    }
}
