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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetLindormFsUsedDetailResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormFsUsedDetailResponse.LStorageUsageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormFsUsedDetailResponseUnmarshaller {

	public static GetLindormFsUsedDetailResponse unmarshall(GetLindormFsUsedDetailResponse getLindormFsUsedDetailResponse, UnmarshallerContext _ctx) {
		
		getLindormFsUsedDetailResponse.setRequestId(_ctx.stringValue("GetLindormFsUsedDetailResponse.RequestId"));
		getLindormFsUsedDetailResponse.setValid(_ctx.stringValue("GetLindormFsUsedDetailResponse.Valid"));
		getLindormFsUsedDetailResponse.setFsCapacity(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsCapacity"));
		getLindormFsUsedDetailResponse.setFsCapacityHot(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsCapacityHot"));
		getLindormFsUsedDetailResponse.setFsCapacityCold(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsCapacityCold"));
		getLindormFsUsedDetailResponse.setFsUsedHot(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedHot"));
		getLindormFsUsedDetailResponse.setFsUsedCold(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedCold"));
		getLindormFsUsedDetailResponse.setFsUsedOnLindormTable(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedOnLindormTable"));
		getLindormFsUsedDetailResponse.setFsUsedOnLindormTableData(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedOnLindormTableData"));
		getLindormFsUsedDetailResponse.setFsUsedOnLindormTableWAL(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedOnLindormTableWAL"));
		getLindormFsUsedDetailResponse.setFsUsedOnLindormSearch(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedOnLindormSearch"));
		getLindormFsUsedDetailResponse.setFsUsedOnLindormTSDB(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedOnLindormTSDB"));
		getLindormFsUsedDetailResponse.setFsUsedHotOnLindormTable(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedHotOnLindormTable"));
		getLindormFsUsedDetailResponse.setFsUsedColdOnLindormTable(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedColdOnLindormTable"));
		getLindormFsUsedDetailResponse.setFsUsedHotOnLindormSearch(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedHotOnLindormSearch"));
		getLindormFsUsedDetailResponse.setFsUsedColdOnLindormSearch(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedColdOnLindormSearch"));
		getLindormFsUsedDetailResponse.setFsUsedHotOnLindormTSDB(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedHotOnLindormTSDB"));
		getLindormFsUsedDetailResponse.setFsUsedColdOnLindormTSDB(_ctx.stringValue("GetLindormFsUsedDetailResponse.FsUsedColdOnLindormTSDB"));
		getLindormFsUsedDetailResponse.setAccessDeniedDetail(_ctx.stringValue("GetLindormFsUsedDetailResponse.AccessDeniedDetail"));

		List<LStorageUsageInfo> lStorageUsageList = new ArrayList<LStorageUsageInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormFsUsedDetailResponse.LStorageUsageList.Length"); i++) {
			LStorageUsageInfo lStorageUsageInfo = new LStorageUsageInfo();
			lStorageUsageInfo.setDiskType(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].DiskType"));
			lStorageUsageInfo.setCapacity(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].Capacity"));
			lStorageUsageInfo.setUsed(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].Used"));
			lStorageUsageInfo.setUsedLindormTable(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].UsedLindormTable"));
			lStorageUsageInfo.setUsedLindormTsdb(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].UsedLindormTsdb"));
			lStorageUsageInfo.setUsedLindormSearch(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].UsedLindormSearch"));
			lStorageUsageInfo.setUsedLindormSpark(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].UsedLindormSpark"));
			lStorageUsageInfo.setUsedOther(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].UsedOther"));
			lStorageUsageInfo.setUsedLindormMessage3(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].UsedLindormMessage3"));
			lStorageUsageInfo.setUsedLindormColumn3(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].UsedLindormColumn3"));
			lStorageUsageInfo.setUsedLindormVector3(_ctx.stringValue("GetLindormFsUsedDetailResponse.LStorageUsageList["+ i +"].UsedLindormVector3"));

			lStorageUsageList.add(lStorageUsageInfo);
		}
		getLindormFsUsedDetailResponse.setLStorageUsageList(lStorageUsageList);
	 
	 	return getLindormFsUsedDetailResponse;
	}
}