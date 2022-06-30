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
public class RecoverMigrationJobRequest extends RoaAcsRequest<RecoverMigrationJobResponse> {
	   

	private Integer id;
	public RecoverMigrationJobRequest() {
		super("apds", "2022-03-31", "RecoverMigrationJob");
		setUriPattern("/okss-services/migration-job/recover-migration-job");
		setMethod(MethodType.POST);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
		if(id != null){
			putQueryParameter("id", id.toString());
		}
	}

	@Override
	public Class<RecoverMigrationJobResponse> getResponseClass() {
		return RecoverMigrationJobResponse.class;
	}

}
