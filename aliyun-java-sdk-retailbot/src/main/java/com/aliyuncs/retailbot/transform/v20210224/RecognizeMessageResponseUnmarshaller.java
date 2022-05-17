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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.KnowledgeDTO;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.KnowledgeDTO.Solution;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.KnowledgeDTO.Solution.Condition;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.KnowledgeDTO.Solution.SolutionVariable;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.OutputMessage;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.Scene;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.Scene.SceneDTO;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.UnitSlots;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.UnitSlots.UnitSpan;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.UnitSlots.UnitSpan.NumericSlotValue;
import com.aliyuncs.retailbot.model.v20210224.RecognizeMessageResponse.Data.UnitSlots.UnitSpan.NumericSlotValue.Unit;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeMessageResponseUnmarshaller {

	public static RecognizeMessageResponse unmarshall(RecognizeMessageResponse recognizeMessageResponse, UnmarshallerContext _ctx) {
		
		recognizeMessageResponse.setRequestId(_ctx.stringValue("RecognizeMessageResponse.RequestId"));
		recognizeMessageResponse.setSuccess(_ctx.booleanValue("RecognizeMessageResponse.Success"));
		recognizeMessageResponse.setCode(_ctx.stringValue("RecognizeMessageResponse.Code"));
		recognizeMessageResponse.setMessage(_ctx.stringValue("RecognizeMessageResponse.Message"));

		Data data = new Data();
		data.setExtOutput(_ctx.mapValue("RecognizeMessageResponse.Data.extOutput"));

		Scene scene = new Scene();
		scene.setEmotionTag(_ctx.stringValue("RecognizeMessageResponse.Data.Scene.EmotionTag"));
		scene.setSemanticComplete(_ctx.stringValue("RecognizeMessageResponse.Data.Scene.SemanticComplete"));
		scene.setItemId(_ctx.stringValue("RecognizeMessageResponse.Data.Scene.ItemId"));
		scene.setOrderId(_ctx.stringValue("RecognizeMessageResponse.Data.Scene.OrderId"));

		List<SceneDTO> sceneDTOs = new ArrayList<SceneDTO>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMessageResponse.Data.Scene.SceneDTOs.Length"); i++) {
			SceneDTO sceneDTO = new SceneDTO();
			sceneDTO.setSceneKey(_ctx.stringValue("RecognizeMessageResponse.Data.Scene.SceneDTOs["+ i +"].SceneKey"));
			sceneDTO.setSceneSource(_ctx.stringValue("RecognizeMessageResponse.Data.Scene.SceneDTOs["+ i +"].SceneSource"));

			sceneDTOs.add(sceneDTO);
		}
		scene.setSceneDTOs(sceneDTOs);
		data.setScene(scene);

		UnitSlots unitSlots = new UnitSlots();

		List<UnitSpan> unitSpans = new ArrayList<UnitSpan>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans.Length"); i++) {
			UnitSpan unitSpan = new UnitSpan();
			unitSpan.setStart(_ctx.integerValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].Start"));
			unitSpan.setEnd(_ctx.integerValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].End"));
			unitSpan.setSlotKey(_ctx.stringValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].SlotKey"));
			unitSpan.setSlotValue(_ctx.stringValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].SlotValue"));
			unitSpan.setSource(_ctx.stringValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].Source"));
			unitSpan.setScore(_ctx.doubleValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].Score"));
			unitSpan.setAlias(_ctx.stringValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].Alias"));

			NumericSlotValue numericSlotValue = new NumericSlotValue();
			numericSlotValue.setNum(_ctx.doubleValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].NumericSlotValue.Num"));

			Unit unit = new Unit();
			unit.setUnitKey(_ctx.stringValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].NumericSlotValue.Unit.UnitKey"));
			unit.setUnitName(_ctx.stringValue("RecognizeMessageResponse.Data.UnitSlots.UnitSpans["+ i +"].NumericSlotValue.Unit.UnitName"));
			numericSlotValue.setUnit(unit);
			unitSpan.setNumericSlotValue(numericSlotValue);

			unitSpans.add(unitSpan);
		}
		unitSlots.setUnitSpans(unitSpans);
		data.setUnitSlots(unitSlots);

		List<KnowledgeDTO> knowledges = new ArrayList<KnowledgeDTO>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMessageResponse.Data.Knowledges.Length"); i++) {
			KnowledgeDTO knowledgeDTO = new KnowledgeDTO();
			knowledgeDTO.setKnowledgeId(_ctx.longValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].KnowledgeId"));
			knowledgeDTO.setKnowledgeTitle(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].KnowledgeTitle"));
			knowledgeDTO.setSceneKey(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].SceneKey"));

			List<Solution> solutions = new ArrayList<Solution>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions.Length"); j++) {
				Solution solution = new Solution();
				solution.setSolutionId(_ctx.longValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].SolutionId"));
				solution.setKnowledgeId(_ctx.longValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].KnowledgeId"));
				solution.setSolutionType(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].SolutionType"));
				solution.setSolutionSource(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].SolutionSource"));
				solution.setSolutionContent(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].SolutionContent"));
				solution.setExtraContent(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].ExtraContent"));

				List<Condition> conditions = new ArrayList<Condition>();
				for (int k = 0; k < _ctx.lengthValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].Conditions.Length"); k++) {
					Condition condition = new Condition();
					condition.setConditionType(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].ConditionType"));
					condition.setConditionValue(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].ConditionValue"));

					conditions.add(condition);
				}
				solution.setConditions(conditions);

				List<SolutionVariable> solutionVariables = new ArrayList<SolutionVariable>();
				for (int k = 0; k < _ctx.lengthValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].SolutionVariables.Length"); k++) {
					SolutionVariable solutionVariable = new SolutionVariable();
					solutionVariable.setVariableName(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].SolutionVariables["+ k +"].VariableName"));
					solutionVariable.setVariableType(_ctx.stringValue("RecognizeMessageResponse.Data.Knowledges["+ i +"].Solutions["+ j +"].SolutionVariables["+ k +"].VariableType"));

					solutionVariables.add(solutionVariable);
				}
				solution.setSolutionVariables(solutionVariables);

				solutions.add(solution);
			}
			knowledgeDTO.setSolutions(solutions);

			knowledges.add(knowledgeDTO);
		}
		data.setKnowledges(knowledges);

		List<OutputMessage> outputMessages = new ArrayList<OutputMessage>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMessageResponse.Data.OutputMessages.Length"); i++) {
			OutputMessage outputMessage = new OutputMessage();
			outputMessage.setOutputContentType(_ctx.stringValue("RecognizeMessageResponse.Data.OutputMessages["+ i +"].OutputContentType"));
			outputMessage.setOutputContent(_ctx.mapValue("RecognizeMessageResponse.Data.OutputMessages["+ i +"].OutputContent"));

			outputMessages.add(outputMessage);
		}
		data.setOutputMessages(outputMessages);
		recognizeMessageResponse.setData(data);
	 
	 	return recognizeMessageResponse;
	}
}