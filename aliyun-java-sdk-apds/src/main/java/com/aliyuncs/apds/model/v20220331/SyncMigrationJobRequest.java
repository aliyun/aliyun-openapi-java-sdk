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

package com.aliyuncs.apds.model.v20220331;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SyncMigrationJobRequest extends RoaAcsRequest<SyncMigrationJobResponse> {
	   

	private String regions;

	private String jobType;
	public SyncMigrationJobRequest() {
		super("apds", "2022-03-31", "SyncMigrationJob");
		setUriPattern("/okss-services/migration-job/sync-migration-job");
		setMethod(MethodType.POST);
	}

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
		if(regions != null){
			putQueryParameter("regions", regions);
		}
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
		if(jobType != null){
			putQueryParameter("jobType", jobType);
		}
	}

	@Override
	public Class<SyncMigrationJobResponse> getResponseClass() {
		return SyncMigrationJobResponse.class;
	}

}
