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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCInstanceTypeFamiliesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCInstanceTypeFamiliesResponse extends AcsResponse {

	private String requestId;

	private InstanceTypeFamilies instanceTypeFamilies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceTypeFamilies getInstanceTypeFamilies() {
		return this.instanceTypeFamilies;
	}

	public void setInstanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
		this.instanceTypeFamilies = instanceTypeFamilies;
	}

	public static class InstanceTypeFamilies {

		private List<FamilyList> instanceTypeFamily;

		public List<FamilyList> getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(List<FamilyList> instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public static class FamilyList {

			private String instanceTypeFamilyId;

			private String instanceTypeFamilyDesc;

			public String getInstanceTypeFamilyId() {
				return this.instanceTypeFamilyId;
			}

			public void setInstanceTypeFamilyId(String instanceTypeFamilyId) {
				this.instanceTypeFamilyId = instanceTypeFamilyId;
			}

			public String getInstanceTypeFamilyDesc() {
				return this.instanceTypeFamilyDesc;
			}

			public void setInstanceTypeFamilyDesc(String instanceTypeFamilyDesc) {
				this.instanceTypeFamilyDesc = instanceTypeFamilyDesc;
			}
		}
	}

	@Override
	public DescribeRCInstanceTypeFamiliesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCInstanceTypeFamiliesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
