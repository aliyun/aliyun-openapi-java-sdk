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

package com.aliyuncs.dbfs.model.v20200418;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbfs.transform.v20200418.DescribeDbfsSpecificationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDbfsSpecificationsResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> maxDbfsNumberPerEcs;

	private List<String> supportedEcsInstanceTypeFamily;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getMaxDbfsNumberPerEcs() {
		return this.maxDbfsNumberPerEcs;
	}

	public void setMaxDbfsNumberPerEcs(Map<Object,Object> maxDbfsNumberPerEcs) {
		this.maxDbfsNumberPerEcs = maxDbfsNumberPerEcs;
	}

	public List<String> getSupportedEcsInstanceTypeFamily() {
		return this.supportedEcsInstanceTypeFamily;
	}

	public void setSupportedEcsInstanceTypeFamily(List<String> supportedEcsInstanceTypeFamily) {
		this.supportedEcsInstanceTypeFamily = supportedEcsInstanceTypeFamily;
	}

	@Override
	public DescribeDbfsSpecificationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDbfsSpecificationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
