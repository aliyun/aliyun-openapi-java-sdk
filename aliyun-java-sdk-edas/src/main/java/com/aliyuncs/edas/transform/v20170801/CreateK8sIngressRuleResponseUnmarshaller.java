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

import com.aliyuncs.edas.model.v20170801.CreateK8sIngressRuleResponse;
import com.aliyuncs.edas.model.v20170801.CreateK8sIngressRuleResponse.ChangeOrderIdsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateK8sIngressRuleResponseUnmarshaller {

	public static CreateK8sIngressRuleResponse unmarshall(CreateK8sIngressRuleResponse createK8sIngressRuleResponse, UnmarshallerContext _ctx) {
		
		createK8sIngressRuleResponse.setCode(_ctx.integerValue("CreateK8sIngressRuleResponse.Code"));
		createK8sIngressRuleResponse.setMessage(_ctx.stringValue("CreateK8sIngressRuleResponse.Message"));

		List<ChangeOrderIdsItem> changeOrderIds = new ArrayList<ChangeOrderIdsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateK8sIngressRuleResponse.ChangeOrderIds.Length"); i++) {
			ChangeOrderIdsItem changeOrderIdsItem = new ChangeOrderIdsItem();
			changeOrderIdsItem.setAppId(_ctx.stringValue("CreateK8sIngressRuleResponse.ChangeOrderIds["+ i +"].AppId"));
			changeOrderIdsItem.setChangeOrderId(_ctx.stringValue("CreateK8sIngressRuleResponse.ChangeOrderIds["+ i +"].ChangeOrderId"));

			changeOrderIds.add(changeOrderIdsItem);
		}
		createK8sIngressRuleResponse.setChangeOrderIds(changeOrderIds);
	 
	 	return createK8sIngressRuleResponse;
	}
}