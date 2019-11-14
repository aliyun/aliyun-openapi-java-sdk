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

import com.aliyuncs.fss.model.v20190125.GetScanStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScanStatusResponseUnmarshaller {

	public static GetScanStatusResponse unmarshall(GetScanStatusResponse getScanStatusResponse, UnmarshallerContext _ctx) {
		
		getScanStatusResponse.setRequestId(_ctx.stringValue("GetScanStatusResponse.RequestId"));
		getScanStatusResponse.setFssRequestID(_ctx.stringValue("GetScanStatusResponse.FssRequestID"));
		getScanStatusResponse.setScanStatusName(_ctx.stringValue("GetScanStatusResponse.ScanStatusName"));
		getScanStatusResponse.setScanStatusDesc(_ctx.stringValue("GetScanStatusResponse.ScanStatusDesc"));
		getScanStatusResponse.setTotalStepCount(_ctx.integerValue("GetScanStatusResponse.TotalStepCount"));
		getScanStatusResponse.setScannedRate(_ctx.floatValue("GetScanStatusResponse.ScannedRate"));
		getScanStatusResponse.setFssCode(_ctx.integerValue("GetScanStatusResponse.FssCode"));
		getScanStatusResponse.setFssMessage(_ctx.stringValue("GetScanStatusResponse.FssMessage"));
	 
	 	return getScanStatusResponse;
	}
}