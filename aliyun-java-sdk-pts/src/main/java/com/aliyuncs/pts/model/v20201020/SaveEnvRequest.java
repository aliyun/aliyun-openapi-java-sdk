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

package com.aliyuncs.pts.model.v20201020;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveEnvRequest extends RpcAcsRequest<SaveEnvResponse> {
	   

	@SerializedName("env")
	private Env env;
	public SaveEnvRequest() {
		super("PTS", "2020-10-20", "SaveEnv");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Env getEnv() {
		return this.env;
	}

	public void setEnv(Env env) {
		this.env = env;	
		if (env != null) {
			putQueryParameter("Env" , new Gson().toJson(env));
		}	
	}

	public static class Env {

		@SerializedName("EnvName")
		private String envName;

		@SerializedName("Files")
		private List<FilesItem> files;

		@SerializedName("JmeterPluginLabel")
		private String jmeterPluginLabel;

		@SerializedName("EnvId")
		private String envId;

		@SerializedName("Properties")
		private List<PropertiesItem> properties;

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public List<FilesItem> getFiles() {
			return this.files;
		}

		public void setFiles(List<FilesItem> files) {
			this.files = files;
		}

		public String getJmeterPluginLabel() {
			return this.jmeterPluginLabel;
		}

		public void setJmeterPluginLabel(String jmeterPluginLabel) {
			this.jmeterPluginLabel = jmeterPluginLabel;
		}

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
		}

		public List<PropertiesItem> getProperties() {
			return this.properties;
		}

		public void setProperties(List<PropertiesItem> properties) {
			this.properties = properties;
		}

		public static class FilesItem {

			@SerializedName("FileName")
			private String fileName;

			@SerializedName("FileOssAddress")
			private String fileOssAddress;

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getFileOssAddress() {
				return this.fileOssAddress;
			}

			public void setFileOssAddress(String fileOssAddress) {
				this.fileOssAddress = fileOssAddress;
			}
		}

		public static class PropertiesItem {

			@SerializedName("Name")
			private String name;

			@SerializedName("Description")
			private String description;

			@SerializedName("Value")
			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public Class<SaveEnvResponse> getResponseClass() {
		return SaveEnvResponse.class;
	}

}
