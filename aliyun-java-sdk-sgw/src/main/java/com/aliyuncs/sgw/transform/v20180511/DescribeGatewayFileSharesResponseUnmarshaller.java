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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayFileSharesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayFileSharesResponse.FileShare;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayFileSharesResponseUnmarshaller {

	public static DescribeGatewayFileSharesResponse unmarshall(DescribeGatewayFileSharesResponse describeGatewayFileSharesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayFileSharesResponse.setRequestId(_ctx.stringValue("DescribeGatewayFileSharesResponse.RequestId"));
		describeGatewayFileSharesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayFileSharesResponse.Success"));
		describeGatewayFileSharesResponse.setCode(_ctx.stringValue("DescribeGatewayFileSharesResponse.Code"));
		describeGatewayFileSharesResponse.setMessage(_ctx.stringValue("DescribeGatewayFileSharesResponse.Message"));

		List<FileShare> fileShares = new ArrayList<FileShare>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayFileSharesResponse.FileShares.Length"); i++) {
			FileShare fileShare = new FileShare();
			fileShare.setName(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Name"));
			fileShare.setDiskId(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DiskId"));
			fileShare.setDiskType(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DiskType"));
			fileShare.setBizProtocol(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Protocol"));
			fileShare.setSize(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Size"));
			fileShare.setEnabled(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Enabled"));
			fileShare.setState(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].State"));
			fileShare.setTotalUpload(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].TotalUpload"));
			fileShare.setTotalDownload(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].TotalDownload"));
			fileShare.setOssBucketName(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssBucketName"));
			fileShare.setOssEndpoint(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssEndpoint"));
			fileShare.setOssBucketSsl(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssBucketSsl"));
			fileShare.setLocalPath(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].LocalPath"));
			fileShare.setCacheMode(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].CacheMode"));
			fileShare.setAddress(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Address"));
			fileShare.setSerialNumber(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].SerialNumber"));
			fileShare.setIndexId(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].IndexId"));
			fileShare.setRemoteSync(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RemoteSync"));
			fileShare.setPollingInterval(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].PollingInterval"));
			fileShare.setIgnoreDelete(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].IgnoreDelete"));
			fileShare.setFeLimit(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].FeLimit"));
			fileShare.setBeLimit(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].BeLimit"));
			fileShare.setInPlace(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].InPlace"));
			fileShare.setBrowsable(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Browsable"));
			fileShare.setSquash(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Squash"));
			fileShare.setRwUserList(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RwUserList"));
			fileShare.setRoUserList(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RoUserList"));
			fileShare.setRwClientList(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RwClientList"));
			fileShare.setRoClientList(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RoClientList"));
			fileShare.setOssUsed(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssUsed"));
			fileShare.setUsed(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].Used"));
			fileShare.setInRate(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].InRate"));
			fileShare.setOutRate(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OutRate"));
			fileShare.setLagPeriod(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].LagPeriod"));
			fileShare.setDirectIO(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DirectIO"));
			fileShare.setNfsFullPath(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].NfsFullPath"));
			fileShare.setFileNumLimit(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].FileNumLimit"));
			fileShare.setFsSizeLimit(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].FsSizeLimit"));
			fileShare.setServerSideEncryption(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ServerSideEncryption"));
			fileShare.setServerSideCmk(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ServerSideCmk"));
			fileShare.setClientSideEncryption(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ClientSideEncryption"));
			fileShare.setClientSideCmk(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ClientSideCmk"));
			fileShare.setKmsRotatePeriod(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].KmsRotatePeriod"));
			fileShare.setOssHealth(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].OssHealth"));
			fileShare.setPathPrefix(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].PathPrefix"));
			fileShare.setFastReclaim(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].FastReclaim"));
			fileShare.setSupportArchive(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].SupportArchive"));
			fileShare.setRemainingMetaSpace(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RemainingMetaSpace"));
			fileShare.setMnsHealth(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].MnsHealth"));
			fileShare.setExpressSyncId(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ExpressSyncId"));
			fileShare.setWindowsAcl(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].WindowsAcl"));
			fileShare.setAccessBasedEnumeration(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].AccessBasedEnumeration"));
			fileShare.setNfsV4Optimization(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].NfsV4Optimization"));
			fileShare.setBucketsStub(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].BucketsStub"));
			fileShare.setBucketInfos(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].BucketInfos"));
			fileShare.setObsoleteBuckets(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ObsoleteBuckets"));
			fileShare.setTransferAcceleration(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].TransferAcceleration"));
			fileShare.setDownloadLimit(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DownloadLimit"));
			fileShare.setRemoteSyncDownload(_ctx.booleanValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].RemoteSyncDownload"));
			fileShare.setPartialSyncPaths(_ctx.stringValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].PartialSyncPaths"));
			fileShare.setSyncProgress(_ctx.integerValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].SyncProgress"));
			fileShare.setUploadQueue(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].UploadQueue"));
			fileShare.setDownloadQueue(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DownloadQueue"));
			fileShare.setDownloadRate(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].DownloadRate"));
			fileShare.setActiveMessages(_ctx.longValue("DescribeGatewayFileSharesResponse.FileShares["+ i +"].ActiveMessages"));

			fileShares.add(fileShare);
		}
		describeGatewayFileSharesResponse.setFileShares(fileShares);
	 
	 	return describeGatewayFileSharesResponse;
	}
}