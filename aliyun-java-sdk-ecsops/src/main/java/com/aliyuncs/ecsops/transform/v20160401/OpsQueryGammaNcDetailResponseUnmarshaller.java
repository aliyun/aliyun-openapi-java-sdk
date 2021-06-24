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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryGammaNcDetailResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryGammaNcDetailResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryGammaNcDetailResponse.Data.GammaNcListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryGammaNcDetailResponseUnmarshaller {

	public static OpsQueryGammaNcDetailResponse unmarshall(OpsQueryGammaNcDetailResponse opsQueryGammaNcDetailResponse, UnmarshallerContext _ctx) {
		
		opsQueryGammaNcDetailResponse.setRequestId(_ctx.stringValue("OpsQueryGammaNcDetailResponse.RequestId"));
		opsQueryGammaNcDetailResponse.setCode(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Code"));
		opsQueryGammaNcDetailResponse.setMessage(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Message"));

		Data data = new Data();
		data.setUserGroupQuota(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.UserGroupQuota"));

		List<GammaNcListItem> gammaNcList = new ArrayList<GammaNcListItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList.Length"); i++) {
			GammaNcListItem gammaNcListItem = new GammaNcListItem();
			gammaNcListItem.setAliUid(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].AliUid"));
			gammaNcListItem.setAzName(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].AzName"));
			gammaNcListItem.setClusterAlias(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].ClusterAlias"));
			gammaNcListItem.setClusterGrayCreateBy(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].ClusterGrayCreateBy"));
			gammaNcListItem.setClusterGrayCreateTime(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].ClusterGrayCreateTime"));
			gammaNcListItem.setGrayBizType(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].GrayBizType"));
			gammaNcListItem.setNcGrayCreateBy(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].NcGrayCreateBy"));
			gammaNcListItem.setNcGrayCreateTime(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].NcGrayCreateTime"));
			gammaNcListItem.setNcIp(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].NcIp"));
			gammaNcListItem.setRegionName(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].RegionName"));
			gammaNcListItem.setUserGroup(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].UserGroup"));
			gammaNcListItem.setZoneId(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].ZoneId"));
			gammaNcListItem.setNcQuotaOnCluster(_ctx.stringValue("OpsQueryGammaNcDetailResponse.Data.GammaNcList["+ i +"].NcQuotaOnCluster"));

			gammaNcList.add(gammaNcListItem);
		}
		data.setGammaNcList(gammaNcList);
		opsQueryGammaNcDetailResponse.setData(data);
	 
	 	return opsQueryGammaNcDetailResponse;
	}
}