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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeVmTypeSpecResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeVmTypeSpecResponse.VmInstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeVmTypeSpecResponseUnmarshaller {

	public static OpsDescribeVmTypeSpecResponse unmarshall(OpsDescribeVmTypeSpecResponse opsDescribeVmTypeSpecResponse, UnmarshallerContext _ctx) {
		
		opsDescribeVmTypeSpecResponse.setRequestId(_ctx.stringValue("OpsDescribeVmTypeSpecResponse.RequestId"));

		List<VmInstanceType> vmInstanceTypes = new ArrayList<VmInstanceType>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes.Length"); i++) {
			VmInstanceType vmInstanceType = new VmInstanceType();
			vmInstanceType.setCores(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].Cores"));
			vmInstanceType.setSessionEstablishRate(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].SessionEstablishRate"));
			vmInstanceType.setDiskSize(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].DiskSize"));
			vmInstanceType.setNvmNum(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].NvmNum"));
			vmInstanceType.setInstanceType(_ctx.stringValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].InstanceType"));
			vmInstanceType.setDiskNum(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].DiskNum"));
			vmInstanceType.setFlag(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].Flag"));
			vmInstanceType.setGpuAmount(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].GpuAmount"));
			vmInstanceType.setGpuSpec(_ctx.stringValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].GpuSpec"));
			vmInstanceType.setSessionQuota(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].SessionQuota"));
			vmInstanceType.setNvmSize(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].NvmSize"));
			vmInstanceType.setInstanceTypeFamily(_ctx.stringValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].InstanceTypeFamily"));
			vmInstanceType.setMemorySize(_ctx.stringValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].MemorySize"));
			vmInstanceType.setLocalStorageCategory(_ctx.stringValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].LocalStorageCategory"));
			vmInstanceType.setVmPpsTx(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].VmPpsTx"));
			vmInstanceType.setVmPpsRx(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].VmPpsRx"));
			vmInstanceType.setVmBandwidthTx(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].VmBandwidthTx"));
			vmInstanceType.setVmBandwidthRx(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].VmBandwidthRx"));
			vmInstanceType.setPrivateRxPps(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].PrivateRxPps"));
			vmInstanceType.setPrivateTxPps(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].PrivateTxPps"));
			vmInstanceType.setPublicRxPps(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].PublicRxPps"));
			vmInstanceType.setPublicTxPps(_ctx.longValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].PublicTxPps"));
			vmInstanceType.setBaselineCredit(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].BaselineCredit"));
			vmInstanceType.setEniQuantity(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].EniQuantity"));
			vmInstanceType.setEniPrivateIpAddressQuantity(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].EniPrivateIpAddressQuantity"));
			vmInstanceType.setEniIpv6AddressQuantity(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].EniIpv6AddressQuantity"));
			vmInstanceType.setEnableEniHotPlug(_ctx.booleanValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].EnableEniHotPlug"));
			vmInstanceType.setEniTrunkSupported(_ctx.booleanValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].EniTrunkSupported"));
			vmInstanceType.setEniTotalQuantity(_ctx.integerValue("OpsDescribeVmTypeSpecResponse.VmInstanceTypes["+ i +"].EniTotalQuantity"));

			vmInstanceTypes.add(vmInstanceType);
		}
		opsDescribeVmTypeSpecResponse.setVmInstanceTypes(vmInstanceTypes);
	 
	 	return opsDescribeVmTypeSpecResponse;
	}
}