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

package com.aliyuncs.es_serverless.model.v20220822;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDataStreamsRequest extends RoaAcsRequest<ListDataStreamsResponse> {
	   

	private String appName;

	private String dataStreamName;

	private Integer pageSize;

	private Integer pageNumber;
	public ListDataStreamsRequest() {
		super("es-serverless", "2022-08-22", "ListDataStreams", "elkxops");
		setUriPattern("/openapi/xops/instances/[appName]/data-streams");
		setMethod(MethodType.GET);
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putPathParameter("appName", appName);
		}
	}

	public String getDataStreamName() {
		return this.dataStreamName;
	}

	public void setDataStreamName(String dataStreamName) {
		this.dataStreamName = dataStreamName;
		if(dataStreamName != null){
			putQueryParameter("dataStreamName", dataStreamName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("pageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListDataStreamsResponse> getResponseClass() {
		return ListDataStreamsResponse.class;
	}

}
