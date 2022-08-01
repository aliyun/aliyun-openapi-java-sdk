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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeComputeResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeComputeResourceResponse extends AcsResponse {

	private String requestId;

	private List<ComputeResourceItem> computeResource;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ComputeResourceItem> getComputeResource() {
		return this.computeResource;
	}

	public void setComputeResource(List<ComputeResourceItem> computeResource) {
		this.computeResource = computeResource;
	}

	public static class ComputeResourceItem {

		private String displayValue;

		private String realValue;

		public String getDisplayValue() {
			return this.displayValue;
		}

		public void setDisplayValue(String displayValue) {
			this.displayValue = displayValue;
		}

		public String getRealValue() {
			return this.realValue;
		}

		public void setRealValue(String realValue) {
			this.realValue = realValue;
		}
	}

	@Override
	public DescribeComputeResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeComputeResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
