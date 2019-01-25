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

package com.aliyuncs.chatbot.transform.v20171011;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.EdgesItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Entry;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Entry.PluginFieldDataEntry;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Entry.PluginFieldDataEntry.ContentEntryItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Entry.PluginFieldDataEntry.ContentEntryItem.ConditionEntriesItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Function;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Function.PluginFieldDataFunction;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Function.PluginFieldDataFunction.SwitchItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Response;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Response.PluginFieldDataResponse;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Response.PluginFieldDataResponse.ContentResponse;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Response.PluginFieldDataResponse.ContentResponse.ButtonList;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Response.PluginFieldDataResponse.ContentResponse.ButtonList.ButtonItem;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Slot;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Slot.PluginFieldDataSlot;
import com.aliyuncs.chatbot.model.v20171011.DescribeDialogFlowResponse.ModuleDefinition.NodesItem.PluginData.Slot.PluginFieldDataSlot.ContentSlotItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDialogFlowResponseUnmarshaller {

	public static DescribeDialogFlowResponse unmarshall(DescribeDialogFlowResponse describeDialogFlowResponse, UnmarshallerContext context) {
		
		describeDialogFlowResponse.setRequestId(context.stringValue("DescribeDialogFlowResponse.RequestId"));
		describeDialogFlowResponse.setDialogId(context.longValue("DescribeDialogFlowResponse.DialogId"));
		describeDialogFlowResponse.setInstanceId(context.stringValue("DescribeDialogFlowResponse.InstanceId"));
		describeDialogFlowResponse.setDialogName(context.stringValue("DescribeDialogFlowResponse.DialogName"));
		describeDialogFlowResponse.setModuleId(context.longValue("DescribeDialogFlowResponse.ModuleId"));
		describeDialogFlowResponse.setModuleName(context.stringValue("DescribeDialogFlowResponse.ModuleName"));
		describeDialogFlowResponse.setTemplates(context.stringValue("DescribeDialogFlowResponse.Templates"));
		describeDialogFlowResponse.setCreateTime(context.stringValue("DescribeDialogFlowResponse.CreateTime"));
		describeDialogFlowResponse.setModifyTime(context.stringValue("DescribeDialogFlowResponse.ModifyTime"));
		describeDialogFlowResponse.setCreateUserId(context.stringValue("DescribeDialogFlowResponse.CreateUserId"));
		describeDialogFlowResponse.setCreateUserName(context.stringValue("DescribeDialogFlowResponse.CreateUserName"));
		describeDialogFlowResponse.setModifyUserId(context.stringValue("DescribeDialogFlowResponse.ModifyUserId"));
		describeDialogFlowResponse.setModifyUserName(context.stringValue("DescribeDialogFlowResponse.ModifyUserName"));
		describeDialogFlowResponse.setAccountId(context.stringValue("DescribeDialogFlowResponse.AccountId"));
		describeDialogFlowResponse.setTags(context.stringValue("DescribeDialogFlowResponse.Tags"));
		describeDialogFlowResponse.setStatus(context.integerValue("DescribeDialogFlowResponse.Status"));

		ModuleDefinition moduleDefinition = new ModuleDefinition();

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < context.lengthValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setCode(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].Code"));
			nodesItem.setComponentCode(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].ComponentCode"));
			nodesItem.setPluginDataUpdate(context.booleanValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginDataUpdate"));
			nodesItem.setXx(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].Xx"));
			nodesItem.setYy(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].Yy"));
			nodesItem.setId(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].Id"));
			nodesItem.setLabel(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].Label"));

			PluginData pluginData = new PluginData();

			Entry entry = new Entry();

			PluginFieldDataEntry pluginFieldDataEntry = new PluginFieldDataEntry();
			pluginFieldDataEntry.setLifeSpan(context.integerValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Entry.PluginFieldDataEntry.LifeSpan"));
			pluginFieldDataEntry.setName(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Entry.PluginFieldDataEntry.Name"));

			List<ContentEntryItem> contentEntry = new ArrayList<ContentEntryItem>();
			for (int j = 0; j < context.lengthValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Entry.PluginFieldDataEntry.ContentEntry.Length"); j++) {
				ContentEntryItem contentEntryItem = new ContentEntryItem();

				List<ConditionEntriesItem> conditionEntries = new ArrayList<ConditionEntriesItem>();
				for (int k = 0; k < context.lengthValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Entry.PluginFieldDataEntry.ContentEntry["+ j +"].ConditionEntries.Length"); k++) {
					ConditionEntriesItem conditionEntriesItem = new ConditionEntriesItem();
					conditionEntriesItem.setId(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Entry.PluginFieldDataEntry.ContentEntry["+ j +"].ConditionEntries["+ k +"].Id"));
					conditionEntriesItem.setTerm(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Entry.PluginFieldDataEntry.ContentEntry["+ j +"].ConditionEntries["+ k +"].Term"));
					conditionEntriesItem.setName(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Entry.PluginFieldDataEntry.ContentEntry["+ j +"].ConditionEntries["+ k +"].Name"));
					conditionEntriesItem.setType(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Entry.PluginFieldDataEntry.ContentEntry["+ j +"].ConditionEntries["+ k +"].Type"));
					conditionEntriesItem.setValue(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Entry.PluginFieldDataEntry.ContentEntry["+ j +"].ConditionEntries["+ k +"].Value"));

					conditionEntries.add(conditionEntriesItem);
				}
				contentEntryItem.setConditionEntries(conditionEntries);

				contentEntry.add(contentEntryItem);
			}
			pluginFieldDataEntry.setContentEntry(contentEntry);
			entry.setPluginFieldDataEntry(pluginFieldDataEntry);
			pluginData.setEntry(entry);

			Function function = new Function();

			PluginFieldDataFunction pluginFieldDataFunction = new PluginFieldDataFunction();
			pluginFieldDataFunction.setCode(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Code"));
			pluginFieldDataFunction.setDescription(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Description"));
			pluginFieldDataFunction.setFunction(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Function"));
			pluginFieldDataFunction.setName(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Name"));
			pluginFieldDataFunction.setAliyunService(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.AliyunService"));
			pluginFieldDataFunction.setAliyunFunction(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.AliyunFunction"));
			pluginFieldDataFunction.setEndPoint(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.EndPoint"));
			pluginFieldDataFunction.setType(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Type"));
			pluginFieldDataFunction.setParams(context.mapValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Params"));

			List<SwitchItem> _switch = new ArrayList<SwitchItem>();
			for (int j = 0; j < context.lengthValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Switch.Length"); j++) {
				SwitchItem switchItem = new SwitchItem();
				switchItem.setId(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Switch["+ j +"].Id"));
				switchItem.setLabel(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Switch["+ j +"].Label"));
				switchItem.setType(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Switch["+ j +"].Type"));
				switchItem.setValue(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Switch["+ j +"].Value"));
				switchItem.setName(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Function.PluginFieldDataFunction.Switch["+ j +"].Name"));

				_switch.add(switchItem);
			}
			pluginFieldDataFunction.set_Switch(_switch);
			function.setPluginFieldDataFunction(pluginFieldDataFunction);
			pluginData.setFunction(function);

			Response response = new Response();

			PluginFieldDataResponse pluginFieldDataResponse = new PluginFieldDataResponse();
			pluginFieldDataResponse.setName(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Response.PluginFieldDataResponse.Name"));

			ContentResponse contentResponse = new ContentResponse();
			contentResponse.setText(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Response.PluginFieldDataResponse.ContentResponse.Text"));
			contentResponse.setType(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Response.PluginFieldDataResponse.ContentResponse.Type"));
			contentResponse.setImage(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Response.PluginFieldDataResponse.ContentResponse.Image"));

			ButtonList buttonList = new ButtonList();
			buttonList.setIntro(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Response.PluginFieldDataResponse.ContentResponse.ButtonList.Intro"));

			List<ButtonItem> button = new ArrayList<ButtonItem>();
			for (int j = 0; j < context.lengthValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Response.PluginFieldDataResponse.ContentResponse.ButtonList.Button.Length"); j++) {
				ButtonItem buttonItem = new ButtonItem();
				buttonItem.setName(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Response.PluginFieldDataResponse.ContentResponse.ButtonList.Button["+ j +"].Name"));
				buttonItem.setType(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Response.PluginFieldDataResponse.ContentResponse.ButtonList.Button["+ j +"].Type"));
				buttonItem.setText(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Response.PluginFieldDataResponse.ContentResponse.ButtonList.Button["+ j +"].Text"));

				button.add(buttonItem);
			}
			buttonList.setButton(button);
			contentResponse.setButtonList(buttonList);
			pluginFieldDataResponse.setContentResponse(contentResponse);
			response.setPluginFieldDataResponse(pluginFieldDataResponse);
			pluginData.setResponse(response);

			Slot slot = new Slot();

			PluginFieldDataSlot pluginFieldDataSlot = new PluginFieldDataSlot();
			pluginFieldDataSlot.setIntentId(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.IntentId"));
			pluginFieldDataSlot.setIntentName(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.IntentName"));
			pluginFieldDataSlot.setIsSysIntent(context.booleanValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.IsSysIntent"));
			pluginFieldDataSlot.setName(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.Name"));

			List<ContentSlotItem> contentSlot = new ArrayList<ContentSlotItem>();
			for (int j = 0; j < context.lengthValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.ContentSlot.Length"); j++) {
				ContentSlotItem contentSlotItem = new ContentSlotItem();
				contentSlotItem.setIsArray(context.booleanValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.ContentSlot["+ j +"].IsArray"));
				contentSlotItem.setIsNecessary(context.booleanValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.ContentSlot["+ j +"].IsNecessary"));
				contentSlotItem.setLifeSpan(context.integerValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.ContentSlot["+ j +"].LifeSpan"));
				contentSlotItem.setName(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.ContentSlot["+ j +"].Name"));
				contentSlotItem.setValue(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.ContentSlot["+ j +"].Value"));

				List<String> question = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.ContentSlot["+ j +"].Question.Length"); k++) {
					question.add(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Nodes["+ i +"].PluginData.Slot.PluginFieldDataSlot.ContentSlot["+ j +"].Question["+ k +"]"));
				}
				contentSlotItem.setQuestion(question);

				contentSlot.add(contentSlotItem);
			}
			pluginFieldDataSlot.setContentSlot(contentSlot);
			slot.setPluginFieldDataSlot(pluginFieldDataSlot);
			pluginData.setSlot(slot);
			nodesItem.setPluginData(pluginData);

			nodes.add(nodesItem);
		}
		moduleDefinition.setNodes(nodes);

		List<EdgesItem> edges = new ArrayList<EdgesItem>();
		for (int i = 0; i < context.lengthValue("DescribeDialogFlowResponse.ModuleDefinition.Edges.Length"); i++) {
			EdgesItem edgesItem = new EdgesItem();
			edgesItem.setId(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Edges["+ i +"].Id"));
			edgesItem.setLabel(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Edges["+ i +"].Label"));
			edgesItem.setSource(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Edges["+ i +"].Source"));
			edgesItem.setTarget(context.stringValue("DescribeDialogFlowResponse.ModuleDefinition.Edges["+ i +"].Target"));

			edges.add(edgesItem);
		}
		moduleDefinition.setEdges(edges);
		describeDialogFlowResponse.setModuleDefinition(moduleDefinition);
	 
	 	return describeDialogFlowResponse;
	}
}