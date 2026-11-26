/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.ChatCompletion;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choice;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choice.Message;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choice.Message.Toolcall;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choice.Message.Toolcall.Function;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Usage;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Usage.PromptTokensDetails;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Match;
import com.aliyuncs.gpdb.model.v20160503.ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Usage1;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChatWithKnowledgeBaseStreamResponseUnmarshaller {

	public static ChatWithKnowledgeBaseStreamResponse unmarshall(ChatWithKnowledgeBaseStreamResponse chatWithKnowledgeBaseStreamResponse, UnmarshallerContext _ctx) {
		
		chatWithKnowledgeBaseStreamResponse.setRequestId(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.RequestId"));
		chatWithKnowledgeBaseStreamResponse.setStatus(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.Status"));
		chatWithKnowledgeBaseStreamResponse.setMessage(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.Message"));

		ChatCompletion chatCompletion = new ChatCompletion();
		chatCompletion.setModel(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Model"));
		chatCompletion.setId(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Id"));
		chatCompletion.setCreated(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Created"));

		Usage usage = new Usage();
		usage.setTotalTokens(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Usage.TotalTokens"));
		usage.setCompletionTokens(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Usage.CompletionTokens"));
		usage.setPromptTokens(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Usage.PromptTokens"));

		PromptTokensDetails promptTokensDetails = new PromptTokensDetails();
		promptTokensDetails.setCachedTokens(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Usage.PromptTokensDetails.CachedTokens"));
		usage.setPromptTokensDetails(promptTokensDetails);
		chatCompletion.setUsage(usage);

		List<Choice> choices = new ArrayList<Choice>();
		for (int i = 0; i < _ctx.lengthValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices.Length"); i++) {
			Choice choice = new Choice();
			choice.setIndex(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].Index"));
			choice.setFinishReason(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].FinishReason"));

			Message message = new Message();
			message.setRole(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].Message.Role"));
			message.setReasoningContent(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].Message.ReasoningContent"));
			message.setContent(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].Message.Content"));

			List<Toolcall> toolCalls = new ArrayList<Toolcall>();
			for (int j = 0; j < _ctx.lengthValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].Message.ToolCalls.Length"); j++) {
				Toolcall toolcall = new Toolcall();
				toolcall.setIndex(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].Message.ToolCalls["+ j +"].Index"));
				toolcall.setId(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].Message.ToolCalls["+ j +"].Id"));

				Function function = new Function();
				function.setArguments(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].Message.ToolCalls["+ j +"].Function.Arguments"));
				function.setName(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.ChatCompletion.Choices["+ i +"].Message.ToolCalls["+ j +"].Function.Name"));
				toolcall.setFunction(function);

				toolCalls.add(toolcall);
			}
			message.setToolCalls(toolCalls);
			choice.setMessage(message);

			choices.add(choice);
		}
		chatCompletion.setChoices(choices);
		chatWithKnowledgeBaseStreamResponse.setChatCompletion(chatCompletion);

		MultiCollectionRecallResult multiCollectionRecallResult = new MultiCollectionRecallResult();
		multiCollectionRecallResult.setStatus(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Status"));
		multiCollectionRecallResult.setRequestId(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.RequestId"));
		multiCollectionRecallResult.setTokens(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Tokens"));

		List<String> relations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Relations.Length"); i++) {
			relations.add(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Relations["+ i +"]"));
		}
		multiCollectionRecallResult.setRelations(relations);

		List<String> entities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Entities.Length"); i++) {
			entities.add(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Entities["+ i +"]"));
		}
		multiCollectionRecallResult.setEntities(entities);

		Usage1 usage1 = new Usage1();
		usage1.setEmbeddingTokens(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Usage.EmbeddingTokens"));
		multiCollectionRecallResult.setUsage1(usage1);

		List<Match> matches = new ArrayList<Match>();
		for (int i = 0; i < _ctx.lengthValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches.Length"); i++) {
			Match match = new Match();
			match.setFileURL(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].FileURL"));
			match.setRetrievalSource(_ctx.longValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].RetrievalSource"));
			match.setScore(_ctx.doubleValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].Score"));
			match.setContent(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].Content"));
			match.setFileName(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].FileName"));
			match.setMetadata(_ctx.mapValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].Metadata"));
			match.setRerankScore(_ctx.doubleValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].RerankScore"));
			match.setId(_ctx.stringValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].Id"));

			List<Double> vector = new ArrayList<Double>();
			for (int j = 0; j < _ctx.lengthValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].Vector.Length"); j++) {
				vector.add(_ctx.doubleValue("ChatWithKnowledgeBaseStreamResponse.MultiCollectionRecallResult.Matches["+ i +"].Vector["+ j +"]"));
			}
			match.setVector(vector);

			matches.add(match);
		}
		multiCollectionRecallResult.setMatches(matches);
		chatWithKnowledgeBaseStreamResponse.setMultiCollectionRecallResult(multiCollectionRecallResult);
	 
	 	return chatWithKnowledgeBaseStreamResponse;
	}
}