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

package com.aliyuncs.mhub.transform.v20170825;

import com.aliyuncs.mhub.model.v20170825.SpiPhysicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SpiPhysicalDeleteResourceResponseUnmarshaller {

	public static SpiPhysicalDeleteResourceResponse unmarshall(SpiPhysicalDeleteResourceResponse spiPhysicalDeleteResourceResponse, UnmarshallerContext _ctx) {
		
		spiPhysicalDeleteResourceResponse.setInterrupt(_ctx.booleanValue("SpiPhysicalDeleteResourceResponse.Interrupt"));
		spiPhysicalDeleteResourceResponse.setInvoker(_ctx.stringValue("SpiPhysicalDeleteResourceResponse.Invoker"));
		spiPhysicalDeleteResourceResponse.setPk(_ctx.stringValue("SpiPhysicalDeleteResourceResponse.Pk"));
		spiPhysicalDeleteResourceResponse.setBid(_ctx.stringValue("SpiPhysicalDeleteResourceResponse.Bid"));
		spiPhysicalDeleteResourceResponse.setHid(_ctx.longValue("SpiPhysicalDeleteResourceResponse.Hid"));
		spiPhysicalDeleteResourceResponse.setCountry(_ctx.stringValue("SpiPhysicalDeleteResourceResponse.Country"));
		spiPhysicalDeleteResourceResponse.setTaskIdentifier(_ctx.stringValue("SpiPhysicalDeleteResourceResponse.TaskIdentifier"));
		spiPhysicalDeleteResourceResponse.setTaskExtraData(_ctx.stringValue("SpiPhysicalDeleteResourceResponse.TaskExtraData"));
		spiPhysicalDeleteResourceResponse.setGmtWakeup(_ctx.stringValue("SpiPhysicalDeleteResourceResponse.GmtWakeup"));
		spiPhysicalDeleteResourceResponse.setSuccess(_ctx.booleanValue("SpiPhysicalDeleteResourceResponse.Success"));
		spiPhysicalDeleteResourceResponse.setMessage(_ctx.stringValue("SpiPhysicalDeleteResourceResponse.Message"));
	 
	 	return spiPhysicalDeleteResourceResponse;
	}
}