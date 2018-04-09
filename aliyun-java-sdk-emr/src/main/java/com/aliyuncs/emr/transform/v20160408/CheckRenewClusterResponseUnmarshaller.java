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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.CheckRenewClusterResponse;
import com.aliyuncs.emr.model.v20160408.CheckRenewClusterResponse.RenewEcsDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckRenewClusterResponseUnmarshaller {

	public static CheckRenewClusterResponse unmarshall(CheckRenewClusterResponse checkRenewClusterResponse, UnmarshallerContext context) {
		
		checkRenewClusterResponse.setRequestId(context.stringValue("CheckRenewClusterResponse.RequestId"));
		checkRenewClusterResponse.setClusterId(context.stringValue("CheckRenewClusterResponse.clusterId"));

		List<RenewEcsDO> renewEcsDOList = new ArrayList<RenewEcsDO>();
		for (int i = 0; i < context.lengthValue("CheckRenewClusterResponse.RenewEcsDOList.Length"); i++) {
			RenewEcsDO renewEcsDO = new RenewEcsDO();
			renewEcsDO.setEcsId(context.stringValue("CheckRenewClusterResponse.RenewEcsDOList["+ i +"].EcsId"));
			renewEcsDO.setEcsExpiredTime(context.stringValue("CheckRenewClusterResponse.RenewEcsDOList["+ i +"].EcsExpiredTime"));
			renewEcsDO.setEmrExpiredTime(context.stringValue("CheckRenewClusterResponse.RenewEcsDOList["+ i +"].EmrExpiredTime"));
			renewEcsDO.setEcsAutoRenew(context.stringValue("CheckRenewClusterResponse.RenewEcsDOList["+ i +"].EcsAutoRenew"));
			renewEcsDO.setEmrAutoRenew(context.stringValue("CheckRenewClusterResponse.RenewEcsDOList["+ i +"].EmrAutoRenew"));
			renewEcsDO.setEcsAutoRenewDuration(context.integerValue("CheckRenewClusterResponse.RenewEcsDOList["+ i +"].EcsAutoRenewDuration"));
			renewEcsDO.setEmrAutoRenewDuration(context.integerValue("CheckRenewClusterResponse.RenewEcsDOList["+ i +"].EmrAutoRenewDuration"));
			renewEcsDO.setHostGroupId(context.stringValue("CheckRenewClusterResponse.RenewEcsDOList["+ i +"].HostGroupId"));
			renewEcsDO.setHostGroupType(context.stringValue("CheckRenewClusterResponse.RenewEcsDOList["+ i +"].HostGroupType"));

			renewEcsDOList.add(renewEcsDO);
		}
		checkRenewClusterResponse.setRenewEcsDOList(renewEcsDOList);
	 
	 	return checkRenewClusterResponse;
	}
}