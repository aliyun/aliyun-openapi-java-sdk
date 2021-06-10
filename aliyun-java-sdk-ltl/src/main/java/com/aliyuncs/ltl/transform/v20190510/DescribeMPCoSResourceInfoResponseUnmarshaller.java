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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSResourceInfoResponse;
import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSResourceInfoResponse.Data;
import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSResourceInfoResponse.Data.PhaseQuotaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMPCoSResourceInfoResponseUnmarshaller {

	public static DescribeMPCoSResourceInfoResponse unmarshall(DescribeMPCoSResourceInfoResponse describeMPCoSResourceInfoResponse, UnmarshallerContext _ctx) {
		
		describeMPCoSResourceInfoResponse.setRequestId(_ctx.stringValue("DescribeMPCoSResourceInfoResponse.RequestId"));
		describeMPCoSResourceInfoResponse.setCode(_ctx.integerValue("DescribeMPCoSResourceInfoResponse.Code"));
		describeMPCoSResourceInfoResponse.setSuccess(_ctx.booleanValue("DescribeMPCoSResourceInfoResponse.Success"));
		describeMPCoSResourceInfoResponse.setMessage(_ctx.stringValue("DescribeMPCoSResourceInfoResponse.Message"));

		Data data = new Data();
		data.setMemberQuota(_ctx.longValue("DescribeMPCoSResourceInfoResponse.Data.MemberQuota"));
		data.setUsedMember(_ctx.longValue("DescribeMPCoSResourceInfoResponse.Data.UsedMember"));
		data.setPhaseGroupQuota(_ctx.longValue("DescribeMPCoSResourceInfoResponse.Data.PhaseGroupQuota"));
		data.setUsedPhaseGroup(_ctx.longValue("DescribeMPCoSResourceInfoResponse.Data.UsedPhaseGroup"));

		List<PhaseQuotaInfo> phaseQuotaInfoList = new ArrayList<PhaseQuotaInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMPCoSResourceInfoResponse.Data.PhaseQuotaInfoList.Length"); i++) {
			PhaseQuotaInfo phaseQuotaInfo = new PhaseQuotaInfo();
			phaseQuotaInfo.setPhaseGroupId(_ctx.stringValue("DescribeMPCoSResourceInfoResponse.Data.PhaseQuotaInfoList["+ i +"].PhaseGroupId"));
			phaseQuotaInfo.setPhaseGroupName(_ctx.stringValue("DescribeMPCoSResourceInfoResponse.Data.PhaseQuotaInfoList["+ i +"].PhaseGroupName"));
			phaseQuotaInfo.setPhaseQuota(_ctx.longValue("DescribeMPCoSResourceInfoResponse.Data.PhaseQuotaInfoList["+ i +"].PhaseQuota"));
			phaseQuotaInfo.setUsedPhase(_ctx.longValue("DescribeMPCoSResourceInfoResponse.Data.PhaseQuotaInfoList["+ i +"].UsedPhase"));

			phaseQuotaInfoList.add(phaseQuotaInfo);
		}
		data.setPhaseQuotaInfoList(phaseQuotaInfoList);
		describeMPCoSResourceInfoResponse.setData(data);
	 
	 	return describeMPCoSResourceInfoResponse;
	}
}