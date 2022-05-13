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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.GetDesktopGroupDetailResponse;
import com.aliyuncs.ecd.model.v20200930.GetDesktopGroupDetailResponse.Desktops;
import com.aliyuncs.ecd.model.v20200930.GetDesktopGroupDetailResponse.Desktops.TimerInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDesktopGroupDetailResponseUnmarshaller {

	public static GetDesktopGroupDetailResponse unmarshall(GetDesktopGroupDetailResponse getDesktopGroupDetailResponse, UnmarshallerContext _ctx) {
		
		getDesktopGroupDetailResponse.setRequestId(_ctx.stringValue("GetDesktopGroupDetailResponse.RequestId"));

		Desktops desktops = new Desktops();
		desktops.setStatus(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.Status"));
		desktops.setCreationTime(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.CreationTime"));
		desktops.setPayType(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.PayType"));
		desktops.setResetType(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.ResetType"));
		desktops.setLoadPolicy(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.LoadPolicy"));
		desktops.setPolicyGroupName(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.PolicyGroupName"));
		desktops.setCreator(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.Creator"));
		desktops.setMaxDesktopsCount(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.MaxDesktopsCount"));
		desktops.setAllowAutoSetup(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.AllowAutoSetup"));
		desktops.setResType(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.ResType"));
		desktops.setSystemDiskSize(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.SystemDiskSize"));
		desktops.setPolicyGroupId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.PolicyGroupId"));
		desktops.setOwnBundleId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.OwnBundleId"));
		desktops.setGpuCount(_ctx.floatValue("GetDesktopGroupDetailResponse.Desktops.GpuCount"));
		desktops.setAllowBufferCount(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.AllowBufferCount"));
		desktops.setMemory(_ctx.longValue("GetDesktopGroupDetailResponse.Desktops.Memory"));
		desktops.setGpuSpec(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.GpuSpec"));
		desktops.setDirectoryId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.DirectoryId"));
		desktops.setOwnBundleName(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.OwnBundleName"));
		desktops.setDataDiskCategory(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.DataDiskCategory"));
		desktops.setDesktopGroupName(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.DesktopGroupName"));
		desktops.setBindAmount(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.BindAmount"));
		desktops.setOwnType(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.OwnType"));
		desktops.setSystemDiskCategory(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.SystemDiskCategory"));
		desktops.setOfficeSiteId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.OfficeSiteId"));
		desktops.setKeepDuration(_ctx.longValue("GetDesktopGroupDetailResponse.Desktops.KeepDuration"));
		desktops.setMinDesktopsCount(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.MinDesktopsCount"));
		desktops.setDataDiskSize(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.DataDiskSize"));
		desktops.setDesktopGroupId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.DesktopGroupId"));
		desktops.setOfficeSiteName(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.OfficeSiteName"));
		desktops.setDirectoryType(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.DirectoryType"));
		desktops.setCpu(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.Cpu"));
		desktops.setExpiredTime(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.ExpiredTime"));
		desktops.setComments(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.Comments"));
		desktops.setOfficeSiteType(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.OfficeSiteType"));

		List<TimerInfo> timerInfos = new ArrayList<TimerInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetDesktopGroupDetailResponse.Desktops.TimerInfos.Length"); i++) {
			TimerInfo timerInfo = new TimerInfo();
			timerInfo.setStatus(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.TimerInfos["+ i +"].Status"));
			timerInfo.setCronExpression(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops.TimerInfos["+ i +"].CronExpression"));
			timerInfo.setTimerType(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops.TimerInfos["+ i +"].TimerType"));

			timerInfos.add(timerInfo);
		}
		desktops.setTimerInfos(timerInfos);
		getDesktopGroupDetailResponse.setDesktops(desktops);
	 
	 	return getDesktopGroupDetailResponse;
	}
}