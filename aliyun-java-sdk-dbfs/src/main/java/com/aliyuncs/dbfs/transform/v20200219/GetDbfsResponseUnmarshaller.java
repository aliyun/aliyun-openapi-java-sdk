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

package com.aliyuncs.dbfs.transform.v20200219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbfs.model.v20200219.GetDbfsResponse;
import com.aliyuncs.dbfs.model.v20200219.GetDbfsResponse.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDbfsResponseUnmarshaller {

	public static GetDbfsResponse unmarshall(GetDbfsResponse getDbfsResponse, UnmarshallerContext _ctx) {
		
		getDbfsResponse.setRequestId(_ctx.stringValue("GetDbfsResponse.RequestId"));

		List<Info> dBFSInfo = new ArrayList<Info>();
		for (int i = 0; i < _ctx.lengthValue("GetDbfsResponse.DBFSInfo.Length"); i++) {
			Info info = new Info();
			info.setFsName(_ctx.stringValue("GetDbfsResponse.DBFSInfo["+ i +"].FsName"));
			info.setDBFSClusterId(_ctx.stringValue("GetDbfsResponse.DBFSInfo["+ i +"].DBFSClusterId"));
			info.setCategory(_ctx.stringValue("GetDbfsResponse.DBFSInfo["+ i +"].Category"));
			info.setStatus(_ctx.stringValue("GetDbfsResponse.DBFSInfo["+ i +"].Status"));
			info.setRegionId(_ctx.stringValue("GetDbfsResponse.DBFSInfo["+ i +"].RegionId"));
			info.setZoneId(_ctx.stringValue("GetDbfsResponse.DBFSInfo["+ i +"].ZoneId"));
			info.setAttachNodeNumber(_ctx.integerValue("GetDbfsResponse.DBFSInfo["+ i +"].AttachNodeNumber"));
			info.setPayType(_ctx.stringValue("GetDbfsResponse.DBFSInfo["+ i +"].PayType"));
			info.setFsId(_ctx.stringValue("GetDbfsResponse.DBFSInfo["+ i +"].FsId"));
			info.setSizeG(_ctx.integerValue("GetDbfsResponse.DBFSInfo["+ i +"].SizeG"));

			dBFSInfo.add(info);
		}
		getDbfsResponse.setDBFSInfo(dBFSInfo);
	 
	 	return getDbfsResponse;
	}
}