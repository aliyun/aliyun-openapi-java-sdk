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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.UpdateK8sIngressRuleResponse;
import com.aliyuncs.edas.model.v20170801.UpdateK8sIngressRuleResponse.ChangeOrderIdsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateK8sIngressRuleResponseUnmarshaller {

	public static UpdateK8sIngressRuleResponse unmarshall(UpdateK8sIngressRuleResponse updateK8sIngressRuleResponse, UnmarshallerContext _ctx) {
		
		updateK8sIngressRuleResponse.setCode(_ctx.integerValue("UpdateK8sIngressRuleResponse.Code"));
		updateK8sIngressRuleResponse.setMessage(_ctx.stringValue("UpdateK8sIngressRuleResponse.Message"));

		List<ChangeOrderIdsItem> changeOrderIds = new ArrayList<ChangeOrderIdsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateK8sIngressRuleResponse.ChangeOrderIds.Length"); i++) {
			ChangeOrderIdsItem changeOrderIdsItem = new ChangeOrderIdsItem();
			changeOrderIdsItem.setAppId(_ctx.stringValue("UpdateK8sIngressRuleResponse.ChangeOrderIds["+ i +"].AppId"));
			changeOrderIdsItem.setChangeOrderId(_ctx.stringValue("UpdateK8sIngressRuleResponse.ChangeOrderIds["+ i +"].ChangeOrderId"));

			changeOrderIds.add(changeOrderIdsItem);
		}
		updateK8sIngressRuleResponse.setChangeOrderIds(changeOrderIds);
	 
	 	return updateK8sIngressRuleResponse;
	}
}