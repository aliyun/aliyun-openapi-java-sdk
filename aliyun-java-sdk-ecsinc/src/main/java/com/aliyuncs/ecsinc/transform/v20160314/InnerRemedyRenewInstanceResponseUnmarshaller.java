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

import com.aliyuncs.ecsinc.model.v20160314.InnerRemedyRenewInstanceResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerRemedyRenewInstanceResponse.RelatedOrderItemSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerRemedyRenewInstanceResponseUnmarshaller {

	public static InnerRemedyRenewInstanceResponse unmarshall(InnerRemedyRenewInstanceResponse innerRemedyRenewInstanceResponse, UnmarshallerContext context) {
		
		innerRemedyRenewInstanceResponse.setRequestId(context.stringValue("InnerRemedyRenewInstanceResponse.RequestId"));
		innerRemedyRenewInstanceResponse.setOrderId(context.stringValue("InnerRemedyRenewInstanceResponse.OrderId"));

		List<RelatedOrderItemSet> relatedOrderItemSets = new ArrayList<RelatedOrderItemSet>();
		for (int i = 0; i < context.lengthValue("InnerRemedyRenewInstanceResponse.RelatedOrderItemSets.Length"); i++) {
			RelatedOrderItemSet relatedOrderItemSet = new RelatedOrderItemSet();

			List<String> instanceIdSet = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerRemedyRenewInstanceResponse.RelatedOrderItemSets["+ i +"].InstanceIdSet.Length"); j++) {
				instanceIdSet.add(context.stringValue("InnerRemedyRenewInstanceResponse.RelatedOrderItemSets["+ i +"].InstanceIdSet["+ j +"]"));
			}
			relatedOrderItemSet.setInstanceIdSet(instanceIdSet);

			relatedOrderItemSets.add(relatedOrderItemSet);
		}
		innerRemedyRenewInstanceResponse.setRelatedOrderItemSets(relatedOrderItemSets);
	 
	 	return innerRemedyRenewInstanceResponse;
	}
}