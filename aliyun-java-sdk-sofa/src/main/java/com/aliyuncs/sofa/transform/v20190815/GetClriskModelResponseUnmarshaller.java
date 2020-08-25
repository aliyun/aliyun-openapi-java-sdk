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

import com.aliyuncs.sofa.model.v20190815.GetClriskModelResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskModelResponse.DataNodesItem;
import com.aliyuncs.sofa.model.v20190815.GetClriskModelResponse.ExtMapItem;
import com.aliyuncs.sofa.model.v20190815.GetClriskModelResponse.LastModifier;
import com.aliyuncs.sofa.model.v20190815.GetClriskModelResponse.ModifiedColumn;
import com.aliyuncs.sofa.model.v20190815.GetClriskModelResponse.ModifiedColumn.RuleCodesItem;
import com.aliyuncs.sofa.model.v20190815.GetClriskModelResponse.OwnersItem;
import com.aliyuncs.sofa.model.v20190815.GetClriskModelResponse.SubscribersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskModelResponseUnmarshaller {

	public static GetClriskModelResponse unmarshall(GetClriskModelResponse getClriskModelResponse, UnmarshallerContext _ctx) {
		
		getClriskModelResponse.setRequestId(_ctx.stringValue("GetClriskModelResponse.RequestId"));
		getClriskModelResponse.setResultCode(_ctx.stringValue("GetClriskModelResponse.ResultCode"));
		getClriskModelResponse.setResultMessage(_ctx.stringValue("GetClriskModelResponse.ResultMessage"));
		getClriskModelResponse.setCurrentOwner(_ctx.booleanValue("GetClriskModelResponse.CurrentOwner"));
		getClriskModelResponse.setGmtCreate(_ctx.stringValue("GetClriskModelResponse.GmtCreate"));
		getClriskModelResponse.setGmtModified(_ctx.stringValue("GetClriskModelResponse.GmtModified"));
		getClriskModelResponse.setMemo(_ctx.stringValue("GetClriskModelResponse.Memo"));
		getClriskModelResponse.setModelCode(_ctx.stringValue("GetClriskModelResponse.ModelCode"));
		getClriskModelResponse.setName(_ctx.stringValue("GetClriskModelResponse.Name"));
		getClriskModelResponse.setProductId(_ctx.longValue("GetClriskModelResponse.ProductId"));
		getClriskModelResponse.setProductName(_ctx.stringValue("GetClriskModelResponse.ProductName"));
		getClriskModelResponse.setStatus(_ctx.stringValue("GetClriskModelResponse.Status"));
		getClriskModelResponse.setTriggerDelay(_ctx.stringValue("GetClriskModelResponse.TriggerDelay"));
		getClriskModelResponse.setTriggerMode(_ctx.stringValue("GetClriskModelResponse.TriggerMode"));

		LastModifier lastModifier = new LastModifier();
		lastModifier.setEmail(_ctx.stringValue("GetClriskModelResponse.LastModifier.Email"));
		lastModifier.setLoginName(_ctx.stringValue("GetClriskModelResponse.LastModifier.LoginName"));
		lastModifier.setMobile(_ctx.stringValue("GetClriskModelResponse.LastModifier.Mobile"));
		lastModifier.setNickName(_ctx.stringValue("GetClriskModelResponse.LastModifier.NickName"));
		lastModifier.setOriginId(_ctx.stringValue("GetClriskModelResponse.LastModifier.OriginId"));
		lastModifier.setType(_ctx.stringValue("GetClriskModelResponse.LastModifier.Type"));
		getClriskModelResponse.setLastModifier(lastModifier);

		ModifiedColumn modifiedColumn = new ModifiedColumn();
		modifiedColumn.setModelConfig(_ctx.booleanValue("GetClriskModelResponse.ModifiedColumn.ModelConfig"));

		List<RuleCodesItem> ruleCodes = new ArrayList<RuleCodesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskModelResponse.ModifiedColumn.RuleCodes.Length"); i++) {
			RuleCodesItem ruleCodesItem = new RuleCodesItem();
			ruleCodesItem.setKey(_ctx.stringValue("GetClriskModelResponse.ModifiedColumn.RuleCodes["+ i +"].Key"));
			ruleCodesItem.setValue(_ctx.stringValue("GetClriskModelResponse.ModifiedColumn.RuleCodes["+ i +"].Value"));

			ruleCodes.add(ruleCodesItem);
		}
		modifiedColumn.setRuleCodes(ruleCodes);
		getClriskModelResponse.setModifiedColumn(modifiedColumn);

		List<DataNodesItem> dataNodes = new ArrayList<DataNodesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskModelResponse.DataNodes.Length"); i++) {
			DataNodesItem dataNodesItem = new DataNodesItem();
			dataNodesItem.setDescription(_ctx.stringValue("GetClriskModelResponse.DataNodes["+ i +"].Description"));
			dataNodesItem.setId(_ctx.stringValue("GetClriskModelResponse.DataNodes["+ i +"].Id"));
			dataNodesItem.setName(_ctx.stringValue("GetClriskModelResponse.DataNodes["+ i +"].Name"));
			dataNodesItem.setNodeCode(_ctx.stringValue("GetClriskModelResponse.DataNodes["+ i +"].NodeCode"));
			dataNodesItem.setOdpsProject(_ctx.stringValue("GetClriskModelResponse.DataNodes["+ i +"].OdpsProject"));
			dataNodesItem.setTableAuthDescription(_ctx.stringValue("GetClriskModelResponse.DataNodes["+ i +"].TableAuthDescription"));
			dataNodesItem.setTableName(_ctx.stringValue("GetClriskModelResponse.DataNodes["+ i +"].TableName"));
			dataNodesItem.setUpdateTime(_ctx.stringValue("GetClriskModelResponse.DataNodes["+ i +"].UpdateTime"));
			dataNodesItem.setUpdateUser(_ctx.stringValue("GetClriskModelResponse.DataNodes["+ i +"].UpdateUser"));

			dataNodes.add(dataNodesItem);
		}
		getClriskModelResponse.setDataNodes(dataNodes);

		List<ExtMapItem> extMap = new ArrayList<ExtMapItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskModelResponse.ExtMap.Length"); i++) {
			ExtMapItem extMapItem = new ExtMapItem();
			extMapItem.setKey(_ctx.stringValue("GetClriskModelResponse.ExtMap["+ i +"].Key"));
			extMapItem.setValue(_ctx.stringValue("GetClriskModelResponse.ExtMap["+ i +"].Value"));

			extMap.add(extMapItem);
		}
		getClriskModelResponse.setExtMap(extMap);

		List<OwnersItem> owners = new ArrayList<OwnersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskModelResponse.Owners.Length"); i++) {
			OwnersItem ownersItem = new OwnersItem();
			ownersItem.setEmail(_ctx.stringValue("GetClriskModelResponse.Owners["+ i +"].Email"));
			ownersItem.setLoginName(_ctx.stringValue("GetClriskModelResponse.Owners["+ i +"].LoginName"));
			ownersItem.setMobile(_ctx.stringValue("GetClriskModelResponse.Owners["+ i +"].Mobile"));
			ownersItem.setNickName(_ctx.stringValue("GetClriskModelResponse.Owners["+ i +"].NickName"));
			ownersItem.setOriginId(_ctx.stringValue("GetClriskModelResponse.Owners["+ i +"].OriginId"));
			ownersItem.setType(_ctx.stringValue("GetClriskModelResponse.Owners["+ i +"].Type"));

			owners.add(ownersItem);
		}
		getClriskModelResponse.setOwners(owners);

		List<SubscribersItem> subscribers = new ArrayList<SubscribersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskModelResponse.Subscribers.Length"); i++) {
			SubscribersItem subscribersItem = new SubscribersItem();
			subscribersItem.setEmail(_ctx.stringValue("GetClriskModelResponse.Subscribers["+ i +"].Email"));
			subscribersItem.setLoginName(_ctx.stringValue("GetClriskModelResponse.Subscribers["+ i +"].LoginName"));
			subscribersItem.setMobile(_ctx.stringValue("GetClriskModelResponse.Subscribers["+ i +"].Mobile"));
			subscribersItem.setNickName(_ctx.stringValue("GetClriskModelResponse.Subscribers["+ i +"].NickName"));
			subscribersItem.setOriginId(_ctx.stringValue("GetClriskModelResponse.Subscribers["+ i +"].OriginId"));
			subscribersItem.setType(_ctx.stringValue("GetClriskModelResponse.Subscribers["+ i +"].Type"));

			subscribers.add(subscribersItem);
		}
		getClriskModelResponse.setSubscribers(subscribers);
	 
	 	return getClriskModelResponse;
	}
}