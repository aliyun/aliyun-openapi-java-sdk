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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.GetVaultListResponse;
import com.aliyuncs.hbr.model.v20170908.GetVaultListResponse.Vault;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVaultListResponseUnmarshaller {

	public static GetVaultListResponse unmarshall(GetVaultListResponse getVaultListResponse, UnmarshallerContext _ctx) {
		
		getVaultListResponse.setRequestId(_ctx.stringValue("GetVaultListResponse.RequestId"));
		getVaultListResponse.setSuccess(_ctx.booleanValue("GetVaultListResponse.Success"));
		getVaultListResponse.setCode(_ctx.stringValue("GetVaultListResponse.Code"));
		getVaultListResponse.setMessage(_ctx.stringValue("GetVaultListResponse.Message"));
		getVaultListResponse.setTotalCount(_ctx.integerValue("GetVaultListResponse.TotalCount"));

		List<Vault> vaults = new ArrayList<Vault>();
		for (int i = 0; i < _ctx.lengthValue("GetVaultListResponse.Vaults.Length"); i++) {
			Vault vault = new Vault();
			vault.setVaultId(_ctx.stringValue("GetVaultListResponse.Vaults["+ i +"].VaultId"));
			vault.setVaultRegionId(_ctx.stringValue("GetVaultListResponse.Vaults["+ i +"].VaultRegionId"));
			vault.setVaultName(_ctx.stringValue("GetVaultListResponse.Vaults["+ i +"].VaultName"));
			vault.setVaultType(_ctx.stringValue("GetVaultListResponse.Vaults["+ i +"].VaultType"));
			vault.setVaultStorageClass(_ctx.stringValue("GetVaultListResponse.Vaults["+ i +"].VaultStorageClass"));
			vault.setReplicationSourceVaultId(_ctx.stringValue("GetVaultListResponse.Vaults["+ i +"].ReplicationSourceVaultId"));
			vault.setReplicationSourceRegionId(_ctx.stringValue("GetVaultListResponse.Vaults["+ i +"].ReplicationSourceRegionId"));
			vault.setReplication(_ctx.booleanValue("GetVaultListResponse.Vaults["+ i +"].Replication"));

			vaults.add(vault);
		}
		getVaultListResponse.setVaults(vaults);
	 
	 	return getVaultListResponse;
	}
}