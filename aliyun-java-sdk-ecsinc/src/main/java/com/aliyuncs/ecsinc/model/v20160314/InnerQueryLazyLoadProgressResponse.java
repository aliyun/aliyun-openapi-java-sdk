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
import com.aliyuncs.ecsinc.transform.v20160314.InnerQueryLazyLoadProgressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryLazyLoadProgressResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<DiskLazyLoadProgress> diskLazyLoadProgressSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DiskLazyLoadProgress> getDiskLazyLoadProgressSet() {
		return this.diskLazyLoadProgressSet;
	}

	public void setDiskLazyLoadProgressSet(List<DiskLazyLoadProgress> diskLazyLoadProgressSet) {
		this.diskLazyLoadProgressSet = diskLazyLoadProgressSet;
	}

	public static class DiskLazyLoadProgress {

		private Integer max;

		private Integer value;

		private Boolean finished;

		private String diskId;

		public Integer getMax() {
			return this.max;
		}

		public void setMax(Integer max) {
			this.max = max;
		}

		public Integer getValue() {
			return this.value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public Boolean getFinished() {
			return this.finished;
		}

		public void setFinished(Boolean finished) {
			this.finished = finished;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}
	}

	@Override
	public InnerQueryLazyLoadProgressResponse getInstance(UnmarshallerContext context) {
		return	InnerQueryLazyLoadProgressResponseUnmarshaller.unmarshall(this, context);
	}
}
