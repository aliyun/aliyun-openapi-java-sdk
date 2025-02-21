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

package com.aliyuncs.brain_industrial.transform.v20200920;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brain_industrial.model.v20200920.GetLicenseResponse;
import com.aliyuncs.brain_industrial.model.v20200920.GetLicenseResponse.Data;
import com.aliyuncs.brain_industrial.model.v20200920.GetLicenseResponse.Data.ActivateRecordItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLicenseResponseUnmarshaller {

	public static GetLicenseResponse unmarshall(GetLicenseResponse getLicenseResponse, UnmarshallerContext _ctx) {
		
		getLicenseResponse.setRequestId(_ctx.stringValue("GetLicenseResponse.RequestId"));
		getLicenseResponse.setCode(_ctx.stringValue("GetLicenseResponse.Code"));
		getLicenseResponse.setSuccess(_ctx.stringValue("GetLicenseResponse.Success"));
		getLicenseResponse.setMessage(_ctx.stringValue("GetLicenseResponse.Message"));
		getLicenseResponse.setHttpStatusCode(_ctx.integerValue("GetLicenseResponse.HttpStatusCode"));
		getLicenseResponse.setAccessDeniedDetail(_ctx.stringValue("GetLicenseResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetLicenseResponse.Data.Id"));
		data.setLicenseSpecName(_ctx.stringValue("GetLicenseResponse.Data.LicenseSpecName"));
		data.setBuyTime(_ctx.stringValue("GetLicenseResponse.Data.BuyTime"));
		data.setActivateTime(_ctx.stringValue("GetLicenseResponse.Data.ActivateTime"));
		data.setFingerprint(_ctx.stringValue("GetLicenseResponse.Data.Fingerprint"));
		data.setLicenseCode(_ctx.stringValue("GetLicenseResponse.Data.LicenseCode"));
		data.setEffectTime(_ctx.stringValue("GetLicenseResponse.Data.EffectTime"));
		data.setExpireTime(_ctx.stringValue("GetLicenseResponse.Data.ExpireTime"));
		data.setDuration(_ctx.stringValue("GetLicenseResponse.Data.Duration"));
		data.setStatus(_ctx.stringValue("GetLicenseResponse.Data.Status"));
		data.setAdaptiveMachine(_ctx.stringValue("GetLicenseResponse.Data.AdaptiveMachine"));
		data.setLicenseSpecCode(_ctx.stringValue("GetLicenseResponse.Data.LicenseSpecCode"));
		data.setLicenseSpecType(_ctx.stringValue("GetLicenseResponse.Data.LicenseSpecType"));
		data.setCpuLimit(_ctx.integerValue("GetLicenseResponse.Data.CpuLimit"));
		data.setMemoryLimit(_ctx.integerValue("GetLicenseResponse.Data.MemoryLimit"));
		data.setInstanceId(_ctx.stringValue("GetLicenseResponse.Data.InstanceId"));
		data.setAllDuration(_ctx.stringValue("GetLicenseResponse.Data.AllDuration"));
		data.setApplicableSpecs(_ctx.stringValue("GetLicenseResponse.Data.ApplicableSpecs"));
		data.setDescription(_ctx.stringValue("GetLicenseResponse.Data.Description"));
		data.setUnActivateAllDuration(_ctx.stringValue("GetLicenseResponse.Data.UnActivateAllDuration"));
		data.setProposal(_ctx.stringValue("GetLicenseResponse.Data.Proposal"));

		List<ActivateRecordItem> activateRecord = new ArrayList<ActivateRecordItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLicenseResponse.Data.ActivateRecord.Length"); i++) {
			ActivateRecordItem activateRecordItem = new ActivateRecordItem();
			activateRecordItem.setOrderId(_ctx.stringValue("GetLicenseResponse.Data.ActivateRecord["+ i +"].OrderId"));
			activateRecordItem.setBuyTime(_ctx.stringValue("GetLicenseResponse.Data.ActivateRecord["+ i +"].BuyTime"));
			activateRecordItem.setActivateTime(_ctx.stringValue("GetLicenseResponse.Data.ActivateRecord["+ i +"].ActivateTime"));
			activateRecordItem.setExpireTime(_ctx.stringValue("GetLicenseResponse.Data.ActivateRecord["+ i +"].ExpireTime"));
			activateRecordItem.setDuration(_ctx.stringValue("GetLicenseResponse.Data.ActivateRecord["+ i +"].Duration"));
			activateRecordItem.setStatus(_ctx.stringValue("GetLicenseResponse.Data.ActivateRecord["+ i +"].Status"));
			activateRecordItem.setLicenseCode(_ctx.stringValue("GetLicenseResponse.Data.ActivateRecord["+ i +"].LicenseCode"));

			activateRecord.add(activateRecordItem);
		}
		data.setActivateRecord(activateRecord);
		getLicenseResponse.setData(data);
	 
	 	return getLicenseResponse;
	}
}