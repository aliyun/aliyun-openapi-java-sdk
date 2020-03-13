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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAKSConfigmapRequest extends RpcAcsRequest<CreateAKSConfigmapResponse> {
	   

	private String workspace;

	private List<Data> datas;

	private List<Annotations> annotationss;

	private List<Labels> labelss;

	private String name;

	private String namespace;
	public CreateAKSConfigmapRequest() {
		super("SOFA", "2019-08-15", "CreateAKSConfigmap", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public List<Data> getDatas() {
		return this.datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;	
		if (datas != null) {
			for (int depth1 = 0; depth1 < datas.size(); depth1++) {
				putBodyParameter("Data." + (depth1 + 1) + ".Value" , datas.get(depth1).getValue());
				putBodyParameter("Data." + (depth1 + 1) + ".Key" , datas.get(depth1).getKey());
			}
		}	
	}

	public List<Annotations> getAnnotationss() {
		return this.annotationss;
	}

	public void setAnnotationss(List<Annotations> annotationss) {
		this.annotationss = annotationss;	
		if (annotationss != null) {
			for (int depth1 = 0; depth1 < annotationss.size(); depth1++) {
				putBodyParameter("Annotations." + (depth1 + 1) + ".Value" , annotationss.get(depth1).getValue());
				putBodyParameter("Annotations." + (depth1 + 1) + ".Key" , annotationss.get(depth1).getKey());
			}
		}	
	}

	public List<Labels> getLabelss() {
		return this.labelss;
	}

	public void setLabelss(List<Labels> labelss) {
		this.labelss = labelss;	
		if (labelss != null) {
			for (int depth1 = 0; depth1 < labelss.size(); depth1++) {
				putBodyParameter("Labels." + (depth1 + 1) + ".Value" , labelss.get(depth1).getValue());
				putBodyParameter("Labels." + (depth1 + 1) + ".Key" , labelss.get(depth1).getKey());
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	public static class Data {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class Annotations {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class Labels {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateAKSConfigmapResponse> getResponseClass() {
		return CreateAKSConfigmapResponse.class;
	}

}
