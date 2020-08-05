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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.ListIngressesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIngressesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private String errorCode;

	private String traceId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Ingress> ingressList;

		public List<Ingress> getIngressList() {
			return this.ingressList;
		}

		public void setIngressList(List<Ingress> ingressList) {
			this.ingressList = ingressList;
		}

		public static class Ingress {

			private Long id;

			private String name;

			private String namespaceId;

			private String slbId;

			private String listenerPort;

			private String certId;

			private String description;

			private String slbType;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNamespaceId() {
				return this.namespaceId;
			}

			public void setNamespaceId(String namespaceId) {
				this.namespaceId = namespaceId;
			}

			public String getSlbId() {
				return this.slbId;
			}

			public void setSlbId(String slbId) {
				this.slbId = slbId;
			}

			public String getListenerPort() {
				return this.listenerPort;
			}

			public void setListenerPort(String listenerPort) {
				this.listenerPort = listenerPort;
			}

			public String getCertId() {
				return this.certId;
			}

			public void setCertId(String certId) {
				this.certId = certId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSlbType() {
				return this.slbType;
			}

			public void setSlbType(String slbType) {
				this.slbType = slbType;
			}
		}
	}

	@Override
	public ListIngressesResponse getInstance(UnmarshallerContext context) {
		return	ListIngressesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
