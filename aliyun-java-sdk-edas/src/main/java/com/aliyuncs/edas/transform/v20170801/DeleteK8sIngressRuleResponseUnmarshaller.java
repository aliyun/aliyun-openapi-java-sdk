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

import com.aliyuncs.edas.model.v20170801.DeleteK8sIngressRuleResponse;
import com.aliyuncs.edas.model.v20170801.DeleteK8sIngressRuleResponse.ChangeOrderIdsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteK8sIngressRuleResponseUnmarshaller {

	public static DeleteK8sIngressRuleResponse unmarshall(DeleteK8sIngressRuleResponse deleteK8sIngressRuleResponse, UnmarshallerContext _ctx) {
		
		deleteK8sIngressRuleResponse.setCode(_ctx.integerValue("DeleteK8sIngressRuleResponse.Code"));
		deleteK8sIngressRuleResponse.setMessage(_ctx.stringValue("DeleteK8sIngressRuleResponse.Message"));

		List<ChangeOrderIdsItem> changeOrderIds = new ArrayList<ChangeOrderIdsItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteK8sIngressRuleResponse.ChangeOrderIds.Length"); i++) {
			ChangeOrderIdsItem changeOrderIdsItem = new ChangeOrderIdsItem();
			changeOrderIdsItem.setAppId(_ctx.stringValue("DeleteK8sIngressRuleResponse.ChangeOrderIds["+ i +"].AppId"));
			changeOrderIdsItem.setChangeOrderId(_ctx.stringValue("DeleteK8sIngressRuleResponse.ChangeOrderIds["+ i +"].ChangeOrderId"));

			changeOrderIds.add(changeOrderIdsItem);
		}
		deleteK8sIngressRuleResponse.setChangeOrderIds(changeOrderIds);
	 
	 	return deleteK8sIngressRuleResponse;
	}
}