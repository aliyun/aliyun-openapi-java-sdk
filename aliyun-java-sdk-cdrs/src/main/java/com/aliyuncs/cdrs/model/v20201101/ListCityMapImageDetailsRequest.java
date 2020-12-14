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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCityMapImageDetailsRequest extends RpcAcsRequest<ListCityMapImageDetailsResponse> {
	   

	private String timeInterval;

	private Long recordNumber;

	private String dataSourceId;
	public ListCityMapImageDetailsRequest() {
		super("CDRS", "2020-11-01", "ListCityMapImageDetails");
		setMethod(MethodType.POST);
	}

	public String getTimeInterval() {
		return this.timeInterval;
	}

	public void setTimeInterval(String timeInterval) {
		this.timeInterval = timeInterval;
		if(timeInterval != null){
			putBodyParameter("TimeInterval", timeInterval);
		}
	}

	public Long getRecordNumber() {
		return this.recordNumber;
	}

	public void setRecordNumber(Long recordNumber) {
		this.recordNumber = recordNumber;
		if(recordNumber != null){
			putBodyParameter("RecordNumber", recordNumber.toString());
		}
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putBodyParameter("DataSourceId", dataSourceId);
		}
	}

	@Override
	public Class<ListCityMapImageDetailsResponse> getResponseClass() {
		return ListCityMapImageDetailsResponse.class;
	}

}
