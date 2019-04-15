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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerRenewInstanceResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerRenewInstanceResponse.RelatedOrderItemSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerRenewInstanceResponseUnmarshaller {

	public static InnerRenewInstanceResponse unmarshall(InnerRenewInstanceResponse innerRenewInstanceResponse, UnmarshallerContext context) {
		
		innerRenewInstanceResponse.setRequestId(context.stringValue("InnerRenewInstanceResponse.RequestId"));
		innerRenewInstanceResponse.setOrderId(context.stringValue("InnerRenewInstanceResponse.OrderId"));

		List<RelatedOrderItemSet> relatedOrderItemSets = new ArrayList<RelatedOrderItemSet>();
		for (int i = 0; i < context.lengthValue("InnerRenewInstanceResponse.RelatedOrderItemSets.Length"); i++) {
			RelatedOrderItemSet relatedOrderItemSet = new RelatedOrderItemSet();

			List<String> instanceIdSet = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerRenewInstanceResponse.RelatedOrderItemSets["+ i +"].InstanceIdSet.Length"); j++) {
				instanceIdSet.add(context.stringValue("InnerRenewInstanceResponse.RelatedOrderItemSets["+ i +"].InstanceIdSet["+ j +"]"));
			}
			relatedOrderItemSet.setInstanceIdSet(instanceIdSet);

			relatedOrderItemSets.add(relatedOrderItemSet);
		}
		innerRenewInstanceResponse.setRelatedOrderItemSets(relatedOrderItemSets);
	 
	 	return innerRenewInstanceResponse;
	}
}