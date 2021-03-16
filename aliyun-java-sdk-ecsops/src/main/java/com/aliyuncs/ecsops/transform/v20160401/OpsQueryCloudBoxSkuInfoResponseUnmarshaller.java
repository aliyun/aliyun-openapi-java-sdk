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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryCloudBoxSkuInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModel;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModel.CloudBoxSkuCalInfoModel;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModel.CloudBoxSkuStoreInfoModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryCloudBoxSkuInfoResponseUnmarshaller {

	public static OpsQueryCloudBoxSkuInfoResponse unmarshall(OpsQueryCloudBoxSkuInfoResponse opsQueryCloudBoxSkuInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryCloudBoxSkuInfoResponse.setRequestId(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.RequestId"));

		List<CloudBoxSkuInfoModel> cloudBoxSkuInfoModels = new ArrayList<CloudBoxSkuInfoModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels.Length"); i++) {
			CloudBoxSkuInfoModel cloudBoxSkuInfoModel = new CloudBoxSkuInfoModel();
			cloudBoxSkuInfoModel.setSkuId(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].SkuId"));
			cloudBoxSkuInfoModel.setSkuType(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].SkuType"));
			cloudBoxSkuInfoModel.setSkuCabinetType(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].SkuCabinetType"));
			cloudBoxSkuInfoModel.setSkuDescribe(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].SkuDescribe"));
			cloudBoxSkuInfoModel.setBandwidth(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].Bandwidth"));
			cloudBoxSkuInfoModel.setPowerConsumption(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].PowerConsumption"));
			cloudBoxSkuInfoModel.setWeight(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].Weight"));
			cloudBoxSkuInfoModel.setLength(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].Length"));
			cloudBoxSkuInfoModel.setHight(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].Hight"));
			cloudBoxSkuInfoModel.setWidth(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].Width"));
			cloudBoxSkuInfoModel.setSize(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].Size"));
			cloudBoxSkuInfoModel.setSubmitterName(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].SubmitterName"));
			cloudBoxSkuInfoModel.setComment(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].Comment"));

			List<CloudBoxSkuCalInfoModel> cloudBoxSkuCalInfoModels = new ArrayList<CloudBoxSkuCalInfoModel>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuCalInfoModels.Length"); j++) {
				CloudBoxSkuCalInfoModel cloudBoxSkuCalInfoModel = new CloudBoxSkuCalInfoModel();
				cloudBoxSkuCalInfoModel.setInstanceType(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuCalInfoModels["+ j +"].InstanceType"));
				cloudBoxSkuCalInfoModel.setAmount(_ctx.integerValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuCalInfoModels["+ j +"].Amount"));
				cloudBoxSkuCalInfoModel.setNcType(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuCalInfoModels["+ j +"].NcType"));
				cloudBoxSkuCalInfoModel.setNcAmount(_ctx.integerValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuCalInfoModels["+ j +"].NcAmount"));
				cloudBoxSkuCalInfoModel.setCalProduct(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuCalInfoModels["+ j +"].CalProduct"));

				cloudBoxSkuCalInfoModels.add(cloudBoxSkuCalInfoModel);
			}
			cloudBoxSkuInfoModel.setCloudBoxSkuCalInfoModels(cloudBoxSkuCalInfoModels);

			List<CloudBoxSkuStoreInfoModel> cloudBoxSkuStoreInfoModels = new ArrayList<CloudBoxSkuStoreInfoModel>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuStoreInfoModels.Length"); j++) {
				CloudBoxSkuStoreInfoModel cloudBoxSkuStoreInfoModel = new CloudBoxSkuStoreInfoModel();
				cloudBoxSkuStoreInfoModel.setStoreNcType(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuStoreInfoModels["+ j +"].StoreNcType"));
				cloudBoxSkuStoreInfoModel.setStoreProduct(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuStoreInfoModels["+ j +"].StoreProduct"));
				cloudBoxSkuStoreInfoModel.setStoreMax(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuStoreInfoModels["+ j +"].StoreMax"));
				cloudBoxSkuStoreInfoModel.setStoreMin(_ctx.stringValue("OpsQueryCloudBoxSkuInfoResponse.CloudBoxSkuInfoModels["+ i +"].CloudBoxSkuStoreInfoModels["+ j +"].StoreMin"));

				cloudBoxSkuStoreInfoModels.add(cloudBoxSkuStoreInfoModel);
			}
			cloudBoxSkuInfoModel.setCloudBoxSkuStoreInfoModels(cloudBoxSkuStoreInfoModels);

			cloudBoxSkuInfoModels.add(cloudBoxSkuInfoModel);
		}
		opsQueryCloudBoxSkuInfoResponse.setCloudBoxSkuInfoModels(cloudBoxSkuInfoModels);
	 
	 	return opsQueryCloudBoxSkuInfoResponse;
	}
}