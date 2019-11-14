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

package com.aliyuncs.fss.transform.v20190125;

import com.aliyuncs.fss.model.v20190125.ScanFirmwareResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScanFirmwareResponseUnmarshaller {

	public static ScanFirmwareResponse unmarshall(ScanFirmwareResponse scanFirmwareResponse, UnmarshallerContext _ctx) {
		
		scanFirmwareResponse.setRequestId(_ctx.stringValue("ScanFirmwareResponse.RequestId"));
		scanFirmwareResponse.setData(_ctx.stringValue("ScanFirmwareResponse.Data"));
		scanFirmwareResponse.setFssCode(_ctx.integerValue("ScanFirmwareResponse.FssCode"));
		scanFirmwareResponse.setFssMessage(_ctx.stringValue("ScanFirmwareResponse.FssMessage"));
	 
	 	return scanFirmwareResponse;
	}
}