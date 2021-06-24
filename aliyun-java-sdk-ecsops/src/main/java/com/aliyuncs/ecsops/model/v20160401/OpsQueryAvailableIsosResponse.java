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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryAvailableIsosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryAvailableIsosResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<Iso> isos;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Iso> getIsos() {
		return this.isos;
	}

	public void setIsos(List<Iso> isos) {
		this.isos = isos;
	}

	public static class Iso {

		private String isoId;

		private String isoName;

		public String getIsoId() {
			return this.isoId;
		}

		public void setIsoId(String isoId) {
			this.isoId = isoId;
		}

		public String getIsoName() {
			return this.isoName;
		}

		public void setIsoName(String isoName) {
			this.isoName = isoName;
		}
	}

	@Override
	public OpsQueryAvailableIsosResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryAvailableIsosResponseUnmarshaller.unmarshall(this, context);
	}
}
