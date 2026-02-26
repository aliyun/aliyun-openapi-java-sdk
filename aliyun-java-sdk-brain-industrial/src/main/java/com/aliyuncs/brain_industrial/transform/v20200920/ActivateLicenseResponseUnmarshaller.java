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

import com.aliyuncs.brain_industrial.model.v20200920.ActivateLicenseResponse;
import com.aliyuncs.brain_industrial.model.v20200920.ActivateLicenseResponse.Data;
import com.aliyuncs.brain_industrial.model.v20200920.ActivateLicenseResponse.Data.ActivateRecordItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivateLicenseResponseUnmarshaller {

	public static ActivateLicenseResponse unmarshall(ActivateLicenseResponse activateLicenseResponse, UnmarshallerContext _ctx) {
		
		activateLicenseResponse.setRequestId(_ctx.stringValue("ActivateLicenseResponse.RequestId"));
		activateLicenseResponse.setSuccess(_ctx.stringValue("ActivateLicenseResponse.Success"));
		activateLicenseResponse.setCode(_ctx.stringValue("ActivateLicenseResponse.Code"));
		activateLicenseResponse.setMessage(_ctx.stringValue("ActivateLicenseResponse.Message"));
		activateLicenseResponse.setHttpStatusCode(_ctx.integerValue("ActivateLicenseResponse.HttpStatusCode"));
		activateLicenseResponse.setAccessDeniedDetail(_ctx.stringValue("ActivateLicenseResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setId(_ctx.stringValue("ActivateLicenseResponse.Data.Id"));
		data.setLicenseSpecName(_ctx.stringValue("ActivateLicenseResponse.Data.LicenseSpecName"));
		data.setBuyTime(_ctx.stringValue("ActivateLicenseResponse.Data.BuyTime"));
		data.setActivateTime(_ctx.stringValue("ActivateLicenseResponse.Data.ActivateTime"));
		data.setFingerprint(_ctx.stringValue("ActivateLicenseResponse.Data.Fingerprint"));
		data.setLicenseCode(_ctx.stringValue("ActivateLicenseResponse.Data.LicenseCode"));
		data.setEffectTime(_ctx.stringValue("ActivateLicenseResponse.Data.EffectTime"));
		data.setExpireTime(_ctx.stringValue("ActivateLicenseResponse.Data.ExpireTime"));
		data.setDuration(_ctx.stringValue("ActivateLicenseResponse.Data.Duration"));
		data.setStatus(_ctx.stringValue("ActivateLicenseResponse.Data.Status"));
		data.setCpuLimit(_ctx.integerValue("ActivateLicenseResponse.Data.CpuLimit"));
		data.setMemoryLimit(_ctx.integerValue("ActivateLicenseResponse.Data.MemoryLimit"));
		data.setInstanceId(_ctx.stringValue("ActivateLicenseResponse.Data.InstanceId"));
		data.setAllDuration(_ctx.stringValue("ActivateLicenseResponse.Data.AllDuration"));
		data.setApplicableSpecs(_ctx.stringValue("ActivateLicenseResponse.Data.ApplicableSpecs"));
		data.setDescription(_ctx.stringValue("ActivateLicenseResponse.Data.Description"));
		data.setUnActivateAllDuration(_ctx.stringValue("ActivateLicenseResponse.Data.UnActivateAllDuration"));

		List<ActivateRecordItem> activateRecord = new ArrayList<ActivateRecordItem>();
		for (int i = 0; i < _ctx.lengthValue("ActivateLicenseResponse.Data.ActivateRecord.Length"); i++) {
			ActivateRecordItem activateRecordItem = new ActivateRecordItem();
			activateRecordItem.setOrderId(_ctx.stringValue("ActivateLicenseResponse.Data.ActivateRecord["+ i +"].OrderId"));
			activateRecordItem.setBuyTime(_ctx.stringValue("ActivateLicenseResponse.Data.ActivateRecord["+ i +"].BuyTime"));
			activateRecordItem.setActivateTime(_ctx.stringValue("ActivateLicenseResponse.Data.ActivateRecord["+ i +"].ActivateTime"));
			activateRecordItem.setExpireTime(_ctx.stringValue("ActivateLicenseResponse.Data.ActivateRecord["+ i +"].ExpireTime"));
			activateRecordItem.setDuration(_ctx.stringValue("ActivateLicenseResponse.Data.ActivateRecord["+ i +"].Duration"));
			activateRecordItem.setStatus(_ctx.stringValue("ActivateLicenseResponse.Data.ActivateRecord["+ i +"].Status"));
			activateRecordItem.setLicenseCode(_ctx.stringValue("ActivateLicenseResponse.Data.ActivateRecord["+ i +"].LicenseCode"));

			activateRecord.add(activateRecordItem);
		}
		data.setActivateRecord(activateRecord);
		activateLicenseResponse.setData(data);
	 
	 	return activateLicenseResponse;
	}
}