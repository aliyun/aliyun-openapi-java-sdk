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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.GetArtifactRepositoryCredentialsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.GetArtifactRepositoryCredentialsResponse.AvailableResourcesItem;
import com.aliyuncs.computenestsupplier.model.v20210521.GetArtifactRepositoryCredentialsResponse.Credentials;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetArtifactRepositoryCredentialsResponseUnmarshaller {

	public static GetArtifactRepositoryCredentialsResponse unmarshall(GetArtifactRepositoryCredentialsResponse getArtifactRepositoryCredentialsResponse, UnmarshallerContext _ctx) {
		
		getArtifactRepositoryCredentialsResponse.setRequestId(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.RequestId"));
		getArtifactRepositoryCredentialsResponse.setExpireDate(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.ExpireDate"));

		Credentials credentials = new Credentials();
		credentials.setUsername(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.Credentials.Username"));
		credentials.setPassword(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.Credentials.Password"));
		credentials.setAccessKeyId(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.Credentials.AccessKeyId"));
		credentials.setAccessKeySecret(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.Credentials.AccessKeySecret"));
		credentials.setSecurityToken(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.Credentials.SecurityToken"));
		getArtifactRepositoryCredentialsResponse.setCredentials(credentials);

		List<AvailableResourcesItem> availableResources = new ArrayList<AvailableResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetArtifactRepositoryCredentialsResponse.AvailableResources.Length"); i++) {
			AvailableResourcesItem availableResourcesItem = new AvailableResourcesItem();
			availableResourcesItem.setRegionId(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.AvailableResources["+ i +"].RegionId"));
			availableResourcesItem.setRepositoryName(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.AvailableResources["+ i +"].RepositoryName"));
			availableResourcesItem.setPath(_ctx.stringValue("GetArtifactRepositoryCredentialsResponse.AvailableResources["+ i +"].Path"));

			availableResources.add(availableResourcesItem);
		}
		getArtifactRepositoryCredentialsResponse.setAvailableResources(availableResources);
	 
	 	return getArtifactRepositoryCredentialsResponse;
	}
}