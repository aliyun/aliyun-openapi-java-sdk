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

package com.aliyuncs.tag.transform.v20180828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.ListConfigRulesForTargetResponse;
import com.aliyuncs.tag.model.v20180828.ListConfigRulesForTargetResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigRulesForTargetResponseUnmarshaller {

	public static ListConfigRulesForTargetResponse unmarshall(ListConfigRulesForTargetResponse listConfigRulesForTargetResponse, UnmarshallerContext _ctx) {
		
		listConfigRulesForTargetResponse.setRequestId(_ctx.stringValue("ListConfigRulesForTargetResponse.RequestId"));
		listConfigRulesForTargetResponse.setNextToken(_ctx.stringValue("ListConfigRulesForTargetResponse.NextToken"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListConfigRulesForTargetResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAggregatorId(_ctx.stringValue("ListConfigRulesForTargetResponse.Data["+ i +"].AggregatorId"));
			dataItem.setConfigRuleId(_ctx.stringValue("ListConfigRulesForTargetResponse.Data["+ i +"].ConfigRuleId"));
			dataItem.setPolicyType(_ctx.stringValue("ListConfigRulesForTargetResponse.Data["+ i +"].PolicyType"));
			dataItem.setRemediation(_ctx.booleanValue("ListConfigRulesForTargetResponse.Data["+ i +"].Remediation"));
			dataItem.setTagKey(_ctx.stringValue("ListConfigRulesForTargetResponse.Data["+ i +"].TagKey"));
			dataItem.setTagValue(_ctx.stringValue("ListConfigRulesForTargetResponse.Data["+ i +"].TagValue"));
			dataItem.setTargetId(_ctx.stringValue("ListConfigRulesForTargetResponse.Data["+ i +"].TargetId"));
			dataItem.setTargetType(_ctx.stringValue("ListConfigRulesForTargetResponse.Data["+ i +"].TargetType"));

			data.add(dataItem);
		}
		listConfigRulesForTargetResponse.setData(data);
	 
	 	return listConfigRulesForTargetResponse;
	}
}