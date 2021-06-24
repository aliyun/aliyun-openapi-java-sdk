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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryCloudBoxDeployInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModel;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModel.DeployModel;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModel.DeployModel.DeployInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryCloudBoxDeployInfoResponseUnmarshaller {

	public static OpsQueryCloudBoxDeployInfoResponse unmarshall(OpsQueryCloudBoxDeployInfoResponse opsQueryCloudBoxDeployInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryCloudBoxDeployInfoResponse.setRequestId(_ctx.stringValue("OpsQueryCloudBoxDeployInfoResponse.RequestId"));

		List<CloudBoxDeployInfoModel> cloudBoxDeployInfoModels = new ArrayList<CloudBoxDeployInfoModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels.Length"); i++) {
			CloudBoxDeployInfoModel cloudBoxDeployInfoModel = new CloudBoxDeployInfoModel();
			cloudBoxDeployInfoModel.setStatus(_ctx.stringValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels["+ i +"].Status"));

			List<DeployModel> deployModels = new ArrayList<DeployModel>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels["+ i +"].DeployModels.Length"); j++) {
				DeployModel deployModel = new DeployModel();
				deployModel.setDeployType(_ctx.stringValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels["+ i +"].DeployModels["+ j +"].DeployType"));

				List<DeployInfo> deployInfos = new ArrayList<DeployInfo>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels["+ i +"].DeployModels["+ j +"].DeployInfos.Length"); k++) {
					DeployInfo deployInfo = new DeployInfo();
					deployInfo.setCluster(_ctx.stringValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels["+ i +"].DeployModels["+ j +"].DeployInfos["+ k +"].Cluster"));

					List<String> ags = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels["+ i +"].DeployModels["+ j +"].DeployInfos["+ k +"].Ags.Length"); l++) {
						ags.add(_ctx.stringValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels["+ i +"].DeployModels["+ j +"].DeployInfos["+ k +"].Ags["+ l +"]"));
					}
					deployInfo.setAgs(ags);

					List<String> sns = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels["+ i +"].DeployModels["+ j +"].DeployInfos["+ k +"].Sns.Length"); l++) {
						sns.add(_ctx.stringValue("OpsQueryCloudBoxDeployInfoResponse.CloudBoxDeployInfoModels["+ i +"].DeployModels["+ j +"].DeployInfos["+ k +"].Sns["+ l +"]"));
					}
					deployInfo.setSns(sns);

					deployInfos.add(deployInfo);
				}
				deployModel.setDeployInfos(deployInfos);

				deployModels.add(deployModel);
			}
			cloudBoxDeployInfoModel.setDeployModels(deployModels);

			cloudBoxDeployInfoModels.add(cloudBoxDeployInfoModel);
		}
		opsQueryCloudBoxDeployInfoResponse.setCloudBoxDeployInfoModels(cloudBoxDeployInfoModels);
	 
	 	return opsQueryCloudBoxDeployInfoResponse;
	}
}