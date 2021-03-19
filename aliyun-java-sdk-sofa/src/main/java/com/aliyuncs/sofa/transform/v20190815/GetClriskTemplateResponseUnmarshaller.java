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

import com.aliyuncs.sofa.model.v20190815.GetClriskTemplateResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskTemplateResponse.DataNodesItem;
import com.aliyuncs.sofa.model.v20190815.GetClriskTemplateResponse.LastModifier;
import com.aliyuncs.sofa.model.v20190815.GetClriskTemplateResponse.OwnersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskTemplateResponseUnmarshaller {

	public static GetClriskTemplateResponse unmarshall(GetClriskTemplateResponse getClriskTemplateResponse, UnmarshallerContext _ctx) {
		
		getClriskTemplateResponse.setRequestId(_ctx.stringValue("GetClriskTemplateResponse.RequestId"));
		getClriskTemplateResponse.setResultCode(_ctx.stringValue("GetClriskTemplateResponse.ResultCode"));
		getClriskTemplateResponse.setResultMessage(_ctx.stringValue("GetClriskTemplateResponse.ResultMessage"));
		getClriskTemplateResponse.setCurrentOwner(_ctx.booleanValue("GetClriskTemplateResponse.CurrentOwner"));
		getClriskTemplateResponse.setGmtCreate(_ctx.stringValue("GetClriskTemplateResponse.GmtCreate"));
		getClriskTemplateResponse.setGmtModified(_ctx.stringValue("GetClriskTemplateResponse.GmtModified"));
		getClriskTemplateResponse.setMemo(_ctx.stringValue("GetClriskTemplateResponse.Memo"));
		getClriskTemplateResponse.setModelNumber(_ctx.longValue("GetClriskTemplateResponse.ModelNumber"));
		getClriskTemplateResponse.setProductId(_ctx.longValue("GetClriskTemplateResponse.ProductId"));
		getClriskTemplateResponse.setProductName(_ctx.stringValue("GetClriskTemplateResponse.ProductName"));
		getClriskTemplateResponse.setRuleNumber(_ctx.longValue("GetClriskTemplateResponse.RuleNumber"));
		getClriskTemplateResponse.setTemplateCode(_ctx.stringValue("GetClriskTemplateResponse.TemplateCode"));
		getClriskTemplateResponse.setTemplateName(_ctx.stringValue("GetClriskTemplateResponse.TemplateName"));
		getClriskTemplateResponse.setTriggerDelay(_ctx.stringValue("GetClriskTemplateResponse.TriggerDelay"));
		getClriskTemplateResponse.setTriggerMode(_ctx.stringValue("GetClriskTemplateResponse.TriggerMode"));
		getClriskTemplateResponse.setVersion(_ctx.stringValue("GetClriskTemplateResponse.Version"));
		getClriskTemplateResponse.setIsMultiplex(_ctx.booleanValue("GetClriskTemplateResponse.IsMultiplex"));
		getClriskTemplateResponse.setCheckMethod(_ctx.stringValue("GetClriskTemplateResponse.CheckMethod"));
		getClriskTemplateResponse.setCronExpression(_ctx.stringValue("GetClriskTemplateResponse.CronExpression"));
		getClriskTemplateResponse.setDayType(_ctx.stringValue("GetClriskTemplateResponse.DayType"));
		getClriskTemplateResponse.setAlertDelayTime(_ctx.stringValue("GetClriskTemplateResponse.AlertDelayTime"));
		getClriskTemplateResponse.setFileAttributeMappings(_ctx.stringValue("GetClriskTemplateResponse.FileAttributeMappings"));
		getClriskTemplateResponse.setModelDefineId(_ctx.stringValue("GetClriskTemplateResponse.ModelDefineId"));
		getClriskTemplateResponse.setFirstModelLoaderId(_ctx.stringValue("GetClriskTemplateResponse.FirstModelLoaderId"));
		getClriskTemplateResponse.setSecondModelLoaderId(_ctx.stringValue("GetClriskTemplateResponse.SecondModelLoaderId"));

		LastModifier lastModifier = new LastModifier();
		lastModifier.setEmail(_ctx.stringValue("GetClriskTemplateResponse.LastModifier.Email"));
		lastModifier.setLoginName(_ctx.stringValue("GetClriskTemplateResponse.LastModifier.LoginName"));
		lastModifier.setMobile(_ctx.stringValue("GetClriskTemplateResponse.LastModifier.Mobile"));
		lastModifier.setNickName(_ctx.stringValue("GetClriskTemplateResponse.LastModifier.NickName"));
		lastModifier.setOriginId(_ctx.stringValue("GetClriskTemplateResponse.LastModifier.OriginId"));
		lastModifier.setType(_ctx.stringValue("GetClriskTemplateResponse.LastModifier.Type"));
		getClriskTemplateResponse.setLastModifier(lastModifier);

		List<DataNodesItem> dataNodes = new ArrayList<DataNodesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskTemplateResponse.DataNodes.Length"); i++) {
			DataNodesItem dataNodesItem = new DataNodesItem();
			dataNodesItem.setDescription(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].Description"));
			dataNodesItem.setId(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].Id"));
			dataNodesItem.setName(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].Name"));
			dataNodesItem.setNodeCode(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].NodeCode"));
			dataNodesItem.setOdpsProject(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].OdpsProject"));
			dataNodesItem.setTableAuthDescription(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].TableAuthDescription"));
			dataNodesItem.setTableName(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].TableName"));
			dataNodesItem.setUpdateTime(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].UpdateTime"));
			dataNodesItem.setUpdateUser(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].UpdateUser"));
			dataNodesItem.setType(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].Type"));
			dataNodesItem.setCheckField(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].CheckField"));
			dataNodesItem.setMappingField(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].MappingField"));
			dataNodesItem.setAliasName(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].AliasName"));
			dataNodesItem.setNodeType(_ctx.stringValue("GetClriskTemplateResponse.DataNodes["+ i +"].NodeType"));

			dataNodes.add(dataNodesItem);
		}
		getClriskTemplateResponse.setDataNodes(dataNodes);

		List<OwnersItem> owners = new ArrayList<OwnersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskTemplateResponse.Owners.Length"); i++) {
			OwnersItem ownersItem = new OwnersItem();
			ownersItem.setEmail(_ctx.stringValue("GetClriskTemplateResponse.Owners["+ i +"].Email"));
			ownersItem.setLoginName(_ctx.stringValue("GetClriskTemplateResponse.Owners["+ i +"].LoginName"));
			ownersItem.setMobile(_ctx.stringValue("GetClriskTemplateResponse.Owners["+ i +"].Mobile"));
			ownersItem.setNickName(_ctx.stringValue("GetClriskTemplateResponse.Owners["+ i +"].NickName"));
			ownersItem.setOriginId(_ctx.stringValue("GetClriskTemplateResponse.Owners["+ i +"].OriginId"));
			ownersItem.setType(_ctx.stringValue("GetClriskTemplateResponse.Owners["+ i +"].Type"));

			owners.add(ownersItem);
		}
		getClriskTemplateResponse.setOwners(owners);
	 
	 	return getClriskTemplateResponse;
	}
}