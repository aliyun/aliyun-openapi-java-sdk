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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeCacheAnalysisReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCacheAnalysisReportResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<Map<Object,Object>> hotKeys;

	private List<Map<Object,Object>> bigKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<Map<Object,Object>> getHotKeys() {
		return this.hotKeys;
	}

	public void setHotKeys(List<Map<Object,Object>> hotKeys) {
		this.hotKeys = hotKeys;
	}

	public List<Map<Object,Object>> getBigKeys() {
		return this.bigKeys;
	}

	public void setBigKeys(List<Map<Object,Object>> bigKeys) {
		this.bigKeys = bigKeys;
	}

	@Override
	public DescribeCacheAnalysisReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeCacheAnalysisReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
