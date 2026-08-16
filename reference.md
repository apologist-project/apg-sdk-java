# Reference
## Chat
<details><summary><code>client.chat.listChatCompletions() -> ListChatCompletionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a paginated list of chat completions (prompts) for the agent, with applied tags expanded as { id, name } and share metadata.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.chat().listChatCompletions(
    ListChatCompletionsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**perPage:** `Optional<Integer>` — Results per page (clamped to 100).
    
</dd>
</dl>

<dl>
<dd>

**agentId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**channelId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**bibleId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**cached:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**client:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**configId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**conversationId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**deviceId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**flagged:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**favorited:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**language:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**liked:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**sessionId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**userId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**minTimestamp:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**maxTimestamp:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.chat.createChatCompletion(request) -> ChatCompletionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a chat completion using the agent's configured model. Supports both streaming and non-streaming responses.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.chat().createChatCompletion(
    ChatCompletionRequest.of(new 
    HashMap<String, Object>() {{put("key", "value");
    }})
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ChatCompletionRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.chat.likeCompletion(id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates the like status of a specific chat completion
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.chat().likeCompletion(
    "id",
    LikeRequest
        .builder()
        .liked(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The ID of the chat completion
    
</dd>
</dl>

<dl>
<dd>

**liked:** `Boolean` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.chat.flagCompletion(id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates the flagged status of a specific chat completion
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.chat().flagCompletion(
    "id",
    FlagRequest
        .builder()
        .flagged(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The ID of the chat completion
    
</dd>
</dl>

<dl>
<dd>

**flagged:** `Boolean` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.chat.feedbackCompletion(id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Adds user feedback to a specific chat completion
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.chat().feedbackCompletion(
    "id",
    FeedbackRequest
        .builder()
        .feedback("feedback")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The ID of the chat completion
    
</dd>
</dl>

<dl>
<dd>

**feedback:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.chat.shareCompletion(id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a share record for a specific chat completion
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.chat().shareCompletion(
    "id",
    ShareRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The ID of the chat completion
    
</dd>
</dl>

<dl>
<dd>

**conversationId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**sessionId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**userId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.chat.getChatCompletion(id) -> GetChatCompletionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a single chat completion (prompt) by numeric id or UUID, including applied tags, guardrail/cta metadata, share metadata, and automation results.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.chat().getChatCompletion(
    "id",
    GetChatCompletionRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The numeric id or UUID of the chat completion
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Corpus
<details><summary><code>client.corpus.searchCorpus(request) -> SearchCorpusResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Performs a semantic search across the agent's corpus of knowledge
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.corpus().searchCorpus(
    CorpusSearchRequest
        .builder()
        .query("query")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**query:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**promptId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**filters:** `Optional<CorpusSearchRequestFilters>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.corpus.logCorpusView(model, id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Records that a user viewed a specific corpus item
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.corpus().logCorpusView(
    "model",
    "id",
    ViewRequest
        .builder()
        .promptId("prompt_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**model:** `String` — The model type (e.g., 'source')
    
</dd>
</dl>

<dl>
<dd>

**id:** `String` — The ID of the corpus item
    
</dd>
</dl>

<dl>
<dd>

**promptId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**userId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.corpus.logCorpusImpression(model, id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Records that a corpus item was shown to a user
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.corpus().logCorpusImpression(
    "model",
    "id",
    ImpressionRequest
        .builder()
        .promptId("prompt_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**model:** `String` — The model type (e.g., 'source')
    
</dd>
</dl>

<dl>
<dd>

**id:** `String` — The ID of the corpus item
    
</dd>
</dl>

<dl>
<dd>

**promptId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**userId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.corpus.logCorpusReferralRedirect(model, id) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Records a referral for a corpus item and, when a `url` is supplied, issues a 302 redirect to it. Without a `url`, responds with a success message. Requires either the search API entitlement or a signed `browser_key` cookie.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.corpus().logCorpusReferralRedirect(
    "model",
    "id",
    LogCorpusReferralRedirectRequest
        .builder()
        .promptId("prompt_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**model:** `String` — The model type (e.g., 'source')
    
</dd>
</dl>

<dl>
<dd>

**id:** `String` — The numeric ID of the corpus item
    
</dd>
</dl>

<dl>
<dd>

**promptId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**userId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**url:** `Optional<String>` — URL-encoded destination to redirect to after logging the referral.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.corpus.logCorpusReferral(model, id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Records that a user was referred to a corpus item
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.corpus().logCorpusReferral(
    "model",
    "id",
    ReferralRequest
        .builder()
        .promptId("prompt_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**model:** `String` — The model type (e.g., 'source')
    
</dd>
</dl>

<dl>
<dd>

**id:** `String` — The ID of the corpus item
    
</dd>
</dl>

<dl>
<dd>

**promptId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**userId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Evaluators
<details><summary><code>client.evaluators.listEvaluations(id) -> ListEvaluationsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a paginated list of evaluations for the evaluator, scoped to the requesting agent.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluators().listEvaluations(
    "id",
    ListEvaluationsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The ID or key of the evaluator
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**perPage:** `Optional<Integer>` — Results per page (clamped to 100).
    
</dd>
</dl>

<dl>
<dd>

**minTimestamp:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**maxTimestamp:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**minDuration:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**maxDuration:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**minScore:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**maxScore:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**passed:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**benchmark:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**benchmarkRunId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**benchmarkQuestionId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluators.evaluateContent(id, request) -> EvaluateContentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Runs an evaluation on the provided content using the specified evaluator
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluators().evaluateContent(
    "id",
    EvaluatorRequest
        .builder()
        .content(
            EvaluatorRequestContent.of("content")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The ID or key of the evaluator
    
</dd>
</dl>

<dl>
<dd>

**frequencyPenalty:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**confidenceThreshold:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**content:** `EvaluatorRequestContent` 
    
</dd>
</dl>

<dl>
<dd>

**model:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**presencePenalty:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**reasoningEffort:** `Optional<EvaluatorRequestReasoningEffort>` 
    
</dd>
</dl>

<dl>
<dd>

**verbosity:** `Optional<EvaluatorRequestVerbosity>` 
    
</dd>
</dl>

<dl>
<dd>

**temperature:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**topP:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**variables:** `Optional<Map<String, Optional<String>>>` — Flat string key/value pairs substituted into `{key}` placeholders in the evaluator prompt. Reserved keys (`options`, `option_descriptions`, `criteria`) cannot be overridden. Not persisted; omitted from the response.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluators.getEvaluation(id, evaluationId) -> GetEvaluationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a single evaluation for the evaluator, scoped to the requesting agent.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluators().getEvaluation(
    "id",
    "evaluationId",
    GetEvaluationRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The id or key of the evaluator
    
</dd>
</dl>

<dl>
<dd>

**evaluationId:** `String` — The id or UUID of the evaluation
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## CTAs
<details><summary><code>client.ctAs.matchCtas(request) -> MatchCtasResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Finds matching CTAs based on conversation context, user, session, device, or messages
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ctAs().matchCtas(
    CtaMatchRequest.of(new 
    HashMap<String, Object>() {{put("key", "value");
    }})
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CtaMatchRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ctAs.logCtaClick(id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Records that a user clicked on a specific CTA
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ctAs().logCtaClick(
    "id",
    CtaClickRequest
        .builder()
        .promptId("prompt_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The ID of the CTA
    
</dd>
</dl>

<dl>
<dd>

**promptId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Users
<details><summary><code>client.users.listUsers() -> ListUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a paginated list of users for the agent's team, with applied tags expanded as { id, name } and the persisted responder id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().listUsers(
    ListUsersRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**perPage:** `Optional<Integer>` — Results per page (clamped to 100).
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**tags:** `Optional<String>` — Comma-separated tag ids.
    
</dd>
</dl>

<dl>
<dd>

**responderId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**minTimestamp:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**maxTimestamp:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.listUserFlags() -> ListUserFlagsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a paginated list of user flag definitions for the agent's team (all columns from user_flags), ordered by id ascending.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().listUserFlags(
    ListUserFlagsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**perPage:** `Optional<Integer>` — Results per page (clamped to 100).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.getUser(userId) -> GetUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a single user by external id or internal id, with expanded tags and the persisted responder for the agent.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().getUser(
    "user_id",
    GetUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — The user's external id or internal id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.updateUser(userId, request) -> UpdateUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates a user's external_id and/or tags and upserts the persisted responder for the agent. Only provided fields are changed.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().updateUser(
    "user_id",
    UserUpdateRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — The user's external id or internal id
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` — Your external identifier for the user.
    
</dd>
</dl>

<dl>
<dd>

**tags:** `Optional<List<UserUpdateRequestTagsItem>>` — Applied tags as a mix of existing tag ids and/or default-language tag names. Unknown ids or names are rejected. Tags are mirror-owned and never created here.
    
</dd>
</dl>

<dl>
<dd>

**responderId:** `Optional<Integer>` — Responder to persist for this user on the requesting agent. Must be active on the agent.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Benchmarks
<details><summary><code>client.benchmarks.listBenchmarkRuns(id) -> ListBenchmarkRunsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a paginated list of runs for a benchmark, scoped to the requesting agent. Each run carries nested evaluators, questions, and a flat evaluations array.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.benchmarks().listBenchmarkRuns(
    "id",
    ListBenchmarkRunsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The id or key of the benchmark
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**perPage:** `Optional<Integer>` — Results per page (clamped to 100).
    
</dd>
</dl>

<dl>
<dd>

**minTimestamp:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**maxTimestamp:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**minDuration:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**maxDuration:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**minScore:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**maxScore:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**passed:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**minResponses:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**maxResponses:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.benchmarks.runBenchmark(id, request) -> Map&amp;lt;String, Object&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Executes a benchmark run and returns the aggregated result with nested evaluators, questions, and a flat evaluations array.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.benchmarks().runBenchmark(
    "id",
    BenchmarkRunRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The id or key of the benchmark
    
</dd>
</dl>

<dl>
<dd>

**content:** `Optional<BenchmarkRunRequestContent>` — Content to evaluate. Required when `source_id` is supplied.
    
</dd>
</dl>

<dl>
<dd>

**completionId:** `Optional<String>` — Completion UUID whose stored response should be evaluated.
    
</dd>
</dl>

<dl>
<dd>

**sourceId:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**model:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**numResponses:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**useQuestionVariants:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**reasoningEffort:** `Optional<BenchmarkRunRequestReasoningEffort>` 
    
</dd>
</dl>

<dl>
<dd>

**verbosity:** `Optional<BenchmarkRunRequestVerbosity>` 
    
</dd>
</dl>

<dl>
<dd>

**scoreThreshold:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**valueThreshold:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**temperature:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**topP:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**frequencyPenalty:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**presencePenalty:** `Optional<Double>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.benchmarks.getBenchmarkRun(id, runId) -> GetBenchmarkRunResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a single benchmark run by id or UUID, scoped to the requesting agent, including nested evaluators, questions, and evaluations.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.benchmarks().getBenchmarkRun(
    "id",
    "runId",
    GetBenchmarkRunRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The id or key of the benchmark
    
</dd>
</dl>

<dl>
<dd>

**runId:** `String` — The id or UUID of the run
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Channels
<details><summary><code>client.channels.getDiscordChannelStatus(id) -> GetDiscordChannelStatusResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the status of the Discord channel. Used as a lightweight health/verification endpoint.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.channels().getDiscordChannelStatus(
    "id",
    GetDiscordChannelStatusRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The channel id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.channels.receiveDiscordInteraction(id, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Receives Discord interaction callbacks for the channel. Requests are verified via Ed25519 signature headers; unsigned or invalid requests are rejected. Payload shape is defined by Discord.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.channels().receiveDiscordInteraction(
    "id",
    ReceiveDiscordInteractionRequest
        .builder()
        .signatureEd25519("x-signature-ed25519")
        .signatureTimestamp("x-signature-timestamp")
        .body(
            new HashMap<String, Object>() {{
                put("key", "value");
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The channel id
    
</dd>
</dl>

<dl>
<dd>

**signatureEd25519:** `String` — Discord request signature (hex).
    
</dd>
</dl>

<dl>
<dd>

**signatureTimestamp:** `String` — Discord request timestamp.
    
</dd>
</dl>

<dl>
<dd>

**request:** `Map<String, Object>` — Discord interaction payload.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.channels.getLineChannelStatus(id) -> GetLineChannelStatusResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the status of the LINE channel. Used as a lightweight health/verification endpoint.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.channels().getLineChannelStatus(
    "id",
    GetLineChannelStatusRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The channel id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.channels.receiveLineWebhook(id, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Receives LINE Messaging API webhook events for the channel. Requests are verified via the `x-line-signature` HMAC-SHA256 (Base64) header using the channel secret unless an `api_key` is present. Payload shape is defined by LINE. The route acknowledges quickly and processes text `message` and `follow` events asynchronously.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.channels().receiveLineWebhook(
    "id",
    ReceiveLineWebhookRequest
        .builder()
        .body(
            new HashMap<String, Object>() {{
                put("key", "value");
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The channel id
    
</dd>
</dl>

<dl>
<dd>

**lineSignature:** `Optional<String>` — Base64-encoded HMAC-SHA256 of the raw body keyed with the LINE channel secret. Required when the webhook URL does not include an api_key.
    
</dd>
</dl>

<dl>
<dd>

**request:** `Map<String, Object>` — LINE webhook payload (`destination` + `events`).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.channels.verifyFacebookWebhook(id) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Handles the Meta webhook verification handshake, echoing `hub.challenge` when `hub.verify_token` matches the channel's configured token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.channels().verifyFacebookWebhook(
    "id",
    VerifyFacebookWebhookRequest
        .builder()
        .hubMode(VerifyFacebookWebhookRequestHubMode.SUBSCRIBE)
        .hubVerifyToken("hub.verify_token")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The channel id
    
</dd>
</dl>

<dl>
<dd>

**hubMode:** `VerifyFacebookWebhookRequestHubMode` 
    
</dd>
</dl>

<dl>
<dd>

**hubVerifyToken:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**hubChallenge:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.channels.receiveFacebookMessage(id, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Receives Facebook/Messenger (and Instagram-style) message events for the channel. Payload shape is defined by Meta.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.channels().receiveFacebookMessage(
    "id",
    ReceiveFacebookMessageRequest
        .builder()
        .body(
            new HashMap<String, Object>() {{
                put("key", "value");
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The channel id
    
</dd>
</dl>

<dl>
<dd>

**request:** `Map<String, Object>` — Meta webhook payload.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.channels.getInstagramPrivacyPolicy(id) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a static HTML privacy policy page for the Instagram integration.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.channels().getInstagramPrivacyPolicy(
    "id",
    GetInstagramPrivacyPolicyRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The channel id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.channels.receiveTelegramUpdate(id, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Receives Telegram bot update events for the channel. Non-message updates are acknowledged and ignored. Payload shape is defined by Telegram.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.channels().receiveTelegramUpdate(
    "id",
    ReceiveTelegramUpdateRequest
        .builder()
        .body(
            new HashMap<String, Object>() {{
                put("key", "value");
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The channel id
    
</dd>
</dl>

<dl>
<dd>

**request:** `Map<String, Object>` — Telegram update payload.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.channels.receiveTwilioMessage(id, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Receives inbound Twilio messages for the channel as form-encoded data. Payload fields are defined by Twilio.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.channels().receiveTwilioMessage(
    "id",
    ReceiveTwilioMessageRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — The channel id
    
</dd>
</dl>

<dl>
<dd>

**from:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**body:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Shares
<details><summary><code>client.shares.getSharedMessages(token) -> GetSharedMessagesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Public, unauthenticated read of the messages behind a share token. The token is the bearer capability and enforces tenant isolation against the host agent. An empty or invalid token yields an empty messages array.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.shares().getSharedMessages(
    "token",
    GetSharedMessagesRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**token:** `String` — The share token
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

