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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListClriskModelsResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskModelsResponse.EntranceListItem;
import com.aliyuncs.sofa.model.v20190815.ListClriskModelsResponse.EntranceListItem.DataNodesItem;
import com.aliyuncs.sofa.model.v20190815.ListClriskModelsResponse.EntranceListItem.ExtMapItem;
import com.aliyuncs.sofa.model.v20190815.ListClriskModelsResponse.EntranceListItem.LastModifier;
import com.aliyuncs.sofa.model.v20190815.ListClriskModelsResponse.EntranceListItem.ModifiedColumn;
import com.aliyuncs.sofa.model.v20190815.ListClriskModelsResponse.EntranceListItem.ModifiedColumn.RuleCodesItem;
import com.aliyuncs.sofa.model.v20190815.ListClriskModelsResponse.EntranceListItem.OwnersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskModelsResponseUnmarshaller {

	public static ListClriskModelsResponse unmarshall(ListClriskModelsResponse listClriskModelsResponse, UnmarshallerContext _ctx) {
		
		listClriskModelsResponse.setRequestId(_ctx.stringValue("ListClriskModelsResponse.RequestId"));
		listClriskModelsResponse.setResultCode(_ctx.stringValue("ListClriskModelsResponse.ResultCode"));
		listClriskModelsResponse.setResultMessage(_ctx.stringValue("ListClriskModelsResponse.ResultMessage"));
		listClriskModelsResponse.setPageCount(_ctx.longValue("ListClriskModelsResponse.PageCount"));
		listClriskModelsResponse.setPageNumber(_ctx.longValue("ListClriskModelsResponse.PageNumber"));
		listClriskModelsResponse.setPageSize(_ctx.longValue("ListClriskModelsResponse.PageSize"));
		listClriskModelsResponse.setTotalCount(_ctx.longValue("ListClriskModelsResponse.TotalCount"));

		List<EntranceListItem> entranceList = new ArrayList<EntranceListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskModelsResponse.EntranceList.Length"); i++) {
			EntranceListItem entranceListItem = new EntranceListItem();
			entranceListItem.setCurrentOwner(_ctx.booleanValue("ListClriskModelsResponse.EntranceList["+ i +"].CurrentOwner"));
			entranceListItem.setGmtCreate(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].GmtCreate"));
			entranceListItem.setGmtModified(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].GmtModified"));
			entranceListItem.setMemo(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].Memo"));
			entranceListItem.setModelCode(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].ModelCode"));
			entranceListItem.setName(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].Name"));
			entranceListItem.setProductName(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].ProductName"));
			entranceListItem.setStatus(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].Status"));
			entranceListItem.setTriggerDelay(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].TriggerDelay"));
			entranceListItem.setTriggerMode(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].TriggerMode"));

			LastModifier lastModifier = new LastModifier();
			lastModifier.setEmail(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].LastModifier.Email"));
			lastModifier.setLoginName(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].LastModifier.LoginName"));
			lastModifier.setMobile(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].LastModifier.Mobile"));
			lastModifier.setNickName(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].LastModifier.NickName"));
			lastModifier.setOriginId(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].LastModifier.OriginId"));
			lastModifier.setType(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].LastModifier.Type"));
			entranceListItem.setLastModifier(lastModifier);

			ModifiedColumn modifiedColumn = new ModifiedColumn();
			modifiedColumn.setModelConfig(_ctx.booleanValue("ListClriskModelsResponse.EntranceList["+ i +"].ModifiedColumn.ModelConfig"));

			List<RuleCodesItem> ruleCodes = new ArrayList<RuleCodesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListClriskModelsResponse.EntranceList["+ i +"].ModifiedColumn.RuleCodes.Length"); j++) {
				RuleCodesItem ruleCodesItem = new RuleCodesItem();
				ruleCodesItem.setKey(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].ModifiedColumn.RuleCodes["+ j +"].Key"));
				ruleCodesItem.setValue(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].ModifiedColumn.RuleCodes["+ j +"].Value"));

				ruleCodes.add(ruleCodesItem);
			}
			modifiedColumn.setRuleCodes(ruleCodes);
			entranceListItem.setModifiedColumn(modifiedColumn);

			List<DataNodesItem> dataNodes = new ArrayList<DataNodesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes.Length"); j++) {
				DataNodesItem dataNodesItem = new DataNodesItem();
				dataNodesItem.setDescription(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes["+ j +"].Description"));
				dataNodesItem.setId(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes["+ j +"].Id"));
				dataNodesItem.setName(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes["+ j +"].Name"));
				dataNodesItem.setNodeCode(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes["+ j +"].NodeCode"));
				dataNodesItem.setOdpsProject(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes["+ j +"].OdpsProject"));
				dataNodesItem.setTableAuthDescription(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes["+ j +"].TableAuthDescription"));
				dataNodesItem.setTableName(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes["+ j +"].TableName"));
				dataNodesItem.setUpdateTime(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes["+ j +"].UpdateTime"));
				dataNodesItem.setUpdateUser(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].DataNodes["+ j +"].UpdateUser"));

				dataNodes.add(dataNodesItem);
			}
			entranceListItem.setDataNodes(dataNodes);

			List<ExtMapItem> extMap = new ArrayList<ExtMapItem>();
			for (int j = 0; j < _ctx.lengthValue("ListClriskModelsResponse.EntranceList["+ i +"].ExtMap.Length"); j++) {
				ExtMapItem extMapItem = new ExtMapItem();
				extMapItem.setKey(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].ExtMap["+ j +"].Key"));
				extMapItem.setValue(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].ExtMap["+ j +"].Value"));

				extMap.add(extMapItem);
			}
			entranceListItem.setExtMap(extMap);

			List<OwnersItem> owners = new ArrayList<OwnersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListClriskModelsResponse.EntranceList["+ i +"].Owners.Length"); j++) {
				OwnersItem ownersItem = new OwnersItem();
				ownersItem.setEmail(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].Owners["+ j +"].Email"));
				ownersItem.setLoginName(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].Owners["+ j +"].LoginName"));
				ownersItem.setMobile(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].Owners["+ j +"].Mobile"));
				ownersItem.setNickName(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].Owners["+ j +"].NickName"));
				ownersItem.setOriginId(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].Owners["+ j +"].OriginId"));
				ownersItem.setType(_ctx.stringValue("ListClriskModelsResponse.EntranceList["+ i +"].Owners["+ j +"].Type"));

				owners.add(ownersItem);
			}
			entranceListItem.setOwners(owners);

			entranceList.add(entranceListItem);
		}
		listClriskModelsResponse.setEntranceList(entranceList);
	 
	 	return listClriskModelsResponse;
	}
}