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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceVfioDeviceBdfsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceVfioDeviceBdfsResponse.Bdf;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryInstanceVfioDeviceBdfsResponseUnmarshaller {

	public static OpsQueryInstanceVfioDeviceBdfsResponse unmarshall(OpsQueryInstanceVfioDeviceBdfsResponse opsQueryInstanceVfioDeviceBdfsResponse, UnmarshallerContext _ctx) {
		
		opsQueryInstanceVfioDeviceBdfsResponse.setRequestId(_ctx.stringValue("OpsQueryInstanceVfioDeviceBdfsResponse.RequestId"));

		List<Bdf> bdfList = new ArrayList<Bdf>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryInstanceVfioDeviceBdfsResponse.BdfList.Length"); i++) {
			Bdf bdf = new Bdf();
			bdf.setSourceDomain(_ctx.stringValue("OpsQueryInstanceVfioDeviceBdfsResponse.BdfList["+ i +"].SourceDomain"));
			bdf.setTargetDomain(_ctx.stringValue("OpsQueryInstanceVfioDeviceBdfsResponse.BdfList["+ i +"].TargetDomain"));
			bdf.setSourceBdf(_ctx.stringValue("OpsQueryInstanceVfioDeviceBdfsResponse.BdfList["+ i +"].SourceBdf"));
			bdf.setTargetBdf(_ctx.stringValue("OpsQueryInstanceVfioDeviceBdfsResponse.BdfList["+ i +"].TargetBdf"));

			bdfList.add(bdf);
		}
		opsQueryInstanceVfioDeviceBdfsResponse.setBdfList(bdfList);
	 
	 	return opsQueryInstanceVfioDeviceBdfsResponse;
	}
}