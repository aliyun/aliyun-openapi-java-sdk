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

package com.aliyuncs.antiddos_public.model.v20170518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.antiddos_public.transform.v20170518.DescribeDdosCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDdosCountResponse extends AcsResponse {

	private String requestId;

	private DdosCount ddosCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DdosCount getDdosCount() {
		return this.ddosCount;
	}

	public void setDdosCount(DdosCount ddosCount) {
		this.ddosCount = ddosCount;
	}

	public static class DdosCount {

		private Integer blackholeCount;

		private Integer instacenCount;

		private Integer defenseCount;

		public Integer getBlackholeCount() {
			return this.blackholeCount;
		}

		public void setBlackholeCount(Integer blackholeCount) {
			this.blackholeCount = blackholeCount;
		}

		public Integer getInstacenCount() {
			return this.instacenCount;
		}

		public void setInstacenCount(Integer instacenCount) {
			this.instacenCount = instacenCount;
		}

		public Integer getDefenseCount() {
			return this.defenseCount;
		}

		public void setDefenseCount(Integer defenseCount) {
			this.defenseCount = defenseCount;
		}
	}

	@Override
	public DescribeDdosCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeDdosCountResponseUnmarshaller.unmarshall(this, context);
	}
}
