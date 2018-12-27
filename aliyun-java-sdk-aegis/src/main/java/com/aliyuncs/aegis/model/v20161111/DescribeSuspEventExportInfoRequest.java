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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventExportInfoRequest extends RpcAcsRequest<DescribeSuspEventExportInfoResponse> {
	
	public DescribeSuspEventExportInfoRequest() {
		super("aegis", "2016-11-11", "DescribeSuspEventExportInfo", "vipaegis");
	}

	private String sourceIp;

	private String from;

	private Integer exportId;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from);
		}
	}

	public Integer getExportId() {
		return this.exportId;
	}

	public void setExportId(Integer exportId) {
		this.exportId = exportId;
		if(exportId != null){
			putQueryParameter("ExportId", exportId.toString());
		}
	}

	@Override
	public Class<DescribeSuspEventExportInfoResponse> getResponseClass() {
		return DescribeSuspEventExportInfoResponse.class;
	}

}
