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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCInstanceDdosCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCInstanceDdosCountResponse extends AcsResponse {

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

		private String blackholeCount;

		private String instacenCount;

		private String defenseCount;

		public String getBlackholeCount() {
			return this.blackholeCount;
		}

		public void setBlackholeCount(String blackholeCount) {
			this.blackholeCount = blackholeCount;
		}

		public String getInstacenCount() {
			return this.instacenCount;
		}

		public void setInstacenCount(String instacenCount) {
			this.instacenCount = instacenCount;
		}

		public String getDefenseCount() {
			return this.defenseCount;
		}

		public void setDefenseCount(String defenseCount) {
			this.defenseCount = defenseCount;
		}
	}

	@Override
	public DescribeRCInstanceDdosCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCInstanceDdosCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
