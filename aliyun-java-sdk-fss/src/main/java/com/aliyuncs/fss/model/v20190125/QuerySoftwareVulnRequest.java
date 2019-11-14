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

package com.aliyuncs.fss.model.v20190125;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.fss.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySoftwareVulnRequest extends RpcAcsRequest<QuerySoftwareVulnResponse> {
	   

	private List<FileList> fileLists;
	public QuerySoftwareVulnRequest() {
		super("Fss", "2019-01-25", "QuerySoftwareVuln");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<FileList> getFileLists() {
		return this.fileLists;
	}

	public void setFileLists(List<FileList> fileLists) {
		this.fileLists = fileLists;	
		if (fileLists != null) {
			for (int depth1 = 0; depth1 < fileLists.size(); depth1++) {
				putBodyParameter("FileList." + (depth1 + 1) + ".Product" , fileLists.get(depth1).getProduct());
				putBodyParameter("FileList." + (depth1 + 1) + ".FileName" , fileLists.get(depth1).getFileName());
				putBodyParameter("FileList." + (depth1 + 1) + ".Vendor" , fileLists.get(depth1).getVendor());
				putBodyParameter("FileList." + (depth1 + 1) + ".Version" , fileLists.get(depth1).getVersion());
			}
		}	
	}

	public static class FileList {

		private String product;

		private String fileName;

		private String vendor;

		private String version;

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getVendor() {
			return this.vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public Class<QuerySoftwareVulnResponse> getResponseClass() {
		return QuerySoftwareVulnResponse.class;
	}

}
