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

package com.aliyuncs.sls.model.v20191023;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sls.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateIngestionJobRequest extends RpcAcsRequest<CreateIngestionJobResponse> {
	   

	private String args;

	private String image;

	private String envFromSecret;

	private String restartPolicy;

	private Integer parallelism;

	private String namespace;

	private Integer completions;

	private String envVars;

	private String imagePullSecret;

	private String callerId;

	private String region;

	private String jobName;
	public CreateIngestionJobRequest() {
		super("Sls", "2019-10-23", "CreateIngestionJob");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getArgs() {
		return this.args;
	}

	public void setArgs(String args) {
		this.args = args;
		if(args != null){
			putBodyParameter("Args", args);
		}
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
		if(image != null){
			putBodyParameter("Image", image);
		}
	}

	public String getEnvFromSecret() {
		return this.envFromSecret;
	}

	public void setEnvFromSecret(String envFromSecret) {
		this.envFromSecret = envFromSecret;
		if(envFromSecret != null){
			putBodyParameter("EnvFromSecret", envFromSecret);
		}
	}

	public String getRestartPolicy() {
		return this.restartPolicy;
	}

	public void setRestartPolicy(String restartPolicy) {
		this.restartPolicy = restartPolicy;
		if(restartPolicy != null){
			putBodyParameter("RestartPolicy", restartPolicy);
		}
	}

	public Integer getParallelism() {
		return this.parallelism;
	}

	public void setParallelism(Integer parallelism) {
		this.parallelism = parallelism;
		if(parallelism != null){
			putBodyParameter("Parallelism", parallelism.toString());
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

	public Integer getCompletions() {
		return this.completions;
	}

	public void setCompletions(Integer completions) {
		this.completions = completions;
		if(completions != null){
			putBodyParameter("Completions", completions.toString());
		}
	}

	public String getEnvVars() {
		return this.envVars;
	}

	public void setEnvVars(String envVars) {
		this.envVars = envVars;
		if(envVars != null){
			putBodyParameter("EnvVars", envVars);
		}
	}

	public String getImagePullSecret() {
		return this.imagePullSecret;
	}

	public void setImagePullSecret(String imagePullSecret) {
		this.imagePullSecret = imagePullSecret;
		if(imagePullSecret != null){
			putBodyParameter("ImagePullSecret", imagePullSecret);
		}
	}

	public String getCallerId() {
		return this.callerId;
	}

	public void setCallerId(String callerId) {
		this.callerId = callerId;
		if(callerId != null){
			putBodyParameter("CallerId", callerId);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region);
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putBodyParameter("JobName", jobName);
		}
	}

	@Override
	public Class<CreateIngestionJobResponse> getResponseClass() {
		return CreateIngestionJobResponse.class;
	}

}
