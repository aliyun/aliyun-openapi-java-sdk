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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerRenewInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerRenewInstanceResponse extends AcsResponse {

	private String requestId;

	private String orderId;

	private List<RelatedOrderItemSet> relatedOrderItemSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<RelatedOrderItemSet> getRelatedOrderItemSets() {
		return this.relatedOrderItemSets;
	}

	public void setRelatedOrderItemSets(List<RelatedOrderItemSet> relatedOrderItemSets) {
		this.relatedOrderItemSets = relatedOrderItemSets;
	}

	public static class RelatedOrderItemSet {

		private List<String> instanceIdSet;

		public List<String> getInstanceIdSet() {
			return this.instanceIdSet;
		}

		public void setInstanceIdSet(List<String> instanceIdSet) {
			this.instanceIdSet = instanceIdSet;
		}
	}

	@Override
	public InnerRenewInstanceResponse getInstance(UnmarshallerContext context) {
		return	InnerRenewInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
