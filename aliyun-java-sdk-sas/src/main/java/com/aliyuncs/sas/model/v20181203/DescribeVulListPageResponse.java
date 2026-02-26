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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeVulListPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulListPageResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<DataList> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataList> getData() {
		return this.data;
	}

	public void setData(List<DataList> data) {
		this.data = data;
	}

	public static class DataList {

		private Long releaseTime;

		private String otherId;

		private Integer isSas;

		private String cveId;

		private Long id;

		private Integer isAegis;

		private String title;

		private String extAegis;

		public Long getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(Long releaseTime) {
			this.releaseTime = releaseTime;
		}

		public String getOtherId() {
			return this.otherId;
		}

		public void setOtherId(String otherId) {
			this.otherId = otherId;
		}

		public Integer getIsSas() {
			return this.isSas;
		}

		public void setIsSas(Integer isSas) {
			this.isSas = isSas;
		}

		public String getCveId() {
			return this.cveId;
		}

		public void setCveId(String cveId) {
			this.cveId = cveId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getIsAegis() {
			return this.isAegis;
		}

		public void setIsAegis(Integer isAegis) {
			this.isAegis = isAegis;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getExtAegis() {
			return this.extAegis;
		}

		public void setExtAegis(String extAegis) {
			this.extAegis = extAegis;
		}
	}

	@Override
	public DescribeVulListPageResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulListPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
