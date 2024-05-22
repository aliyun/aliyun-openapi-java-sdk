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

package com.aliyuncs.polardbx.transform.v20200202;

import com.aliyuncs.polardbx.model.v20200202.DescribeColdDataBasicInfoResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeColdDataBasicInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeColdDataBasicInfoResponseUnmarshaller {

	public static DescribeColdDataBasicInfoResponse unmarshall(DescribeColdDataBasicInfoResponse describeColdDataBasicInfoResponse, UnmarshallerContext _ctx) {
		
		describeColdDataBasicInfoResponse.setRequestId(_ctx.stringValue("DescribeColdDataBasicInfoResponse.RequestId"));

		Data data = new Data();
		data.setEnableStatus(_ctx.booleanValue("DescribeColdDataBasicInfoResponse.Data.EnableStatus"));
		data.setCloudProduct(_ctx.stringValue("DescribeColdDataBasicInfoResponse.Data.CloudProduct"));
		data.setVolumeName(_ctx.stringValue("DescribeColdDataBasicInfoResponse.Data.VolumeName"));
		data.setBackupSetSpaceSize(_ctx.doubleValue("DescribeColdDataBasicInfoResponse.Data.BackupSetSpaceSize"));
		data.setBackupSetCount(_ctx.integerValue("DescribeColdDataBasicInfoResponse.Data.BackupSetCount"));
		data.setCurrentSpaceSize(_ctx.doubleValue("DescribeColdDataBasicInfoResponse.Data.CurrentSpaceSize"));
		data.setDataRedundancyType(_ctx.stringValue("DescribeColdDataBasicInfoResponse.Data.DataRedundancyType"));
		data.setWriteAccessNum(_ctx.doubleValue("DescribeColdDataBasicInfoResponse.Data.WriteAccessNum"));
		data.setReadAccessNum(_ctx.longValue("DescribeColdDataBasicInfoResponse.Data.ReadAccessNum"));
		data.setRegionId(_ctx.stringValue("DescribeColdDataBasicInfoResponse.Data.RegionId"));
		describeColdDataBasicInfoResponse.setData(data);
	 
	 	return describeColdDataBasicInfoResponse;
	}
}