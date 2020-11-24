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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDDosEventAttackTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDDosEventAttackTypeResponse extends AcsResponse {

	private String requestId;

	private List<EventAttackType> attackTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EventAttackType> getAttackTypes() {
		return this.attackTypes;
	}

	public void setAttackTypes(List<EventAttackType> attackTypes) {
		this.attackTypes = attackTypes;
	}

	public static class EventAttackType {

		private String attackType;

		private Long inPkts;

		public String getAttackType() {
			return this.attackType;
		}

		public void setAttackType(String attackType) {
			this.attackType = attackType;
		}

		public Long getInPkts() {
			return this.inPkts;
		}

		public void setInPkts(Long inPkts) {
			this.inPkts = inPkts;
		}
	}

	@Override
	public DescribeDDosEventAttackTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDDosEventAttackTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
