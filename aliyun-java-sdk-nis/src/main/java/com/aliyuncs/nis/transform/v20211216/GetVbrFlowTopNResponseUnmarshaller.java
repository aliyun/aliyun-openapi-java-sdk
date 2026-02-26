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

package com.aliyuncs.nis.transform.v20211216;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nis.model.v20211216.GetVbrFlowTopNResponse;
import com.aliyuncs.nis.model.v20211216.GetVbrFlowTopNResponse.VbrFlowlogTopN;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVbrFlowTopNResponseUnmarshaller {

	public static GetVbrFlowTopNResponse unmarshall(GetVbrFlowTopNResponse getVbrFlowTopNResponse, UnmarshallerContext _ctx) {
		
		getVbrFlowTopNResponse.setRequestId(_ctx.stringValue("GetVbrFlowTopNResponse.RequestId"));

		List<VbrFlowlogTopN> virtualBorderRouterFlowlogTopN = new ArrayList<VbrFlowlogTopN>();
		for (int i = 0; i < _ctx.lengthValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN.Length"); i++) {
			VbrFlowlogTopN vbrFlowlogTopN = new VbrFlowlogTopN();
			vbrFlowlogTopN.setCloudRegion(_ctx.stringValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].CloudRegion"));
			vbrFlowlogTopN.setCloudIp(_ctx.stringValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].CloudIp"));
			vbrFlowlogTopN.setOtherIp(_ctx.stringValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].OtherIp"));
			vbrFlowlogTopN.setCloudPort(_ctx.stringValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].CloudPort"));
			vbrFlowlogTopN.setOtherPort(_ctx.stringValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].OtherPort"));
			vbrFlowlogTopN.setBizProtocol(_ctx.stringValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].Protocol"));
			vbrFlowlogTopN.setAttachmentId(_ctx.stringValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].AttachmentId"));
			vbrFlowlogTopN.setVirtualBorderRouterId(_ctx.stringValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].VirtualBorderRouterId"));
			vbrFlowlogTopN.setBytes(_ctx.doubleValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].Bytes"));
			vbrFlowlogTopN.setPackets(_ctx.doubleValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].Packets"));
			vbrFlowlogTopN.setAccountId(_ctx.stringValue("GetVbrFlowTopNResponse.VirtualBorderRouterFlowlogTopN["+ i +"].AccountId"));

			virtualBorderRouterFlowlogTopN.add(vbrFlowlogTopN);
		}
		getVbrFlowTopNResponse.setVirtualBorderRouterFlowlogTopN(virtualBorderRouterFlowlogTopN);
	 
	 	return getVbrFlowTopNResponse;
	}
}