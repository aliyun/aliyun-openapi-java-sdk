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

package com.aliyuncs.qianzhou.model.v20211111;

import com.aliyuncs.RoaAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AICreateSessionMessageRequest extends RoaAcsRequest<AICreateSessionMessageResponse> {
	   

	private String employee_id;

	@SerializedName("body")
	private Body body;
	public AICreateSessionMessageRequest() {
		super("qianzhou", "2021-11-11", "AICreateSessionMessage");
		setUriPattern("/popapi/AICreateSessionMessage");
		setMethod(MethodType.POST);
	}

	public String getEmployee_id() {
		return this.employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
		if(employee_id != null){
			putQueryParameter("employee_id", employee_id);
		}
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("context")
		private Context context;

		@SerializedName("session_id")
		private String session_id;

		@SerializedName("language")
		private String language;

		@SerializedName("type")
		private String type;

		@SerializedName("message")
		private String message;

		public Context getContext() {
			return this.context;
		}

		public void setContext(Context context) {
			this.context = context;
		}

		public String getSession_id() {
			return this.session_id;
		}

		public void setSession_id(String session_id) {
			this.session_id = session_id;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public static class Context {

			@SerializedName("cluster_id")
			private String cluster_id;

			@SerializedName("kind")
			private String kind;

			@SerializedName("namespace")
			private String namespace;

			@SerializedName("name")
			private String name;

			@SerializedName("error")
			private String error;

			@SerializedName("uuid")
			private String uuid;

			public String getCluster_id() {
				return this.cluster_id;
			}

			public void setCluster_id(String cluster_id) {
				this.cluster_id = cluster_id;
			}

			public String getKind() {
				return this.kind;
			}

			public void setKind(String kind) {
				this.kind = kind;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getError() {
				return this.error;
			}

			public void setError(String error) {
				this.error = error;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}
		}
	}

	@Override
	public Class<AICreateSessionMessageResponse> getResponseClass() {
		return AICreateSessionMessageResponse.class;
	}

}
