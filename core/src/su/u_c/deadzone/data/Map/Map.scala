// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package su.u_c.deadzone.data.Map



@SerialVersionUID(0L)
final case class Map(
    width: Int = 0,
    height: Int = 0,
    tiles: scala.collection.Seq[Int] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Map] with com.trueaccord.lenses.Updatable[Map] {
    private[this] def tilesSerializedSize = {
    if (__tilesSerializedSizeField == 0) __tilesSerializedSizeField = 
      tiles.map(com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag).sum
    __tilesSerializedSizeField
    }
    @transient private[this] var __tilesSerializedSizeField: Int = 0
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (width != 0) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, width) }
      if (height != 0) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, height) }
      if(tiles.nonEmpty) {
        val __localsize = tilesSerializedSize
        __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
      }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = width
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = height
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      if (tiles.nonEmpty) {
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(tilesSerializedSize)
        tiles.foreach(_output__.writeInt32NoTag)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): su.u_c.deadzone.data.Map.Map = {
      var __width = this.width
      var __height = this.height
      val __tiles = (scala.collection.immutable.Vector.newBuilder[Int] ++= this.tiles)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __width = _input__.readInt32()
          case 16 =>
            __height = _input__.readInt32()
          case 24 =>
            __tiles += _input__.readInt32()
          case 26 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __tiles += _input__.readInt32
            }
            _input__.popLimit(oldLimit)
          }
          case tag => _input__.skipField(tag)
        }
      }
      su.u_c.deadzone.data.Map.Map(
          width = __width,
          height = __height,
          tiles = __tiles.result()
      )
    }
    def withWidth(__v: Int): Map = copy(width = __v)
    def withHeight(__v: Int): Map = copy(height = __v)
    def clearTiles = copy(tiles = scala.collection.Seq.empty)
    def addTiles(__vs: Int*): Map = addAllTiles(__vs)
    def addAllTiles(__vs: TraversableOnce[Int]): Map = copy(tiles = tiles ++ __vs)
    def withTiles(__v: scala.collection.Seq[Int]): Map = copy(tiles = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = width
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = height
          if (__t != 0) __t else null
        }
        case 3 => tiles
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = su.u_c.deadzone.data.Map.Map
}

object Map extends com.trueaccord.scalapb.GeneratedMessageCompanion[su.u_c.deadzone.data.Map.Map] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[su.u_c.deadzone.data.Map.Map] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): su.u_c.deadzone.data.Map.Map = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    su.u_c.deadzone.data.Map.Map(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[scala.collection.Seq[Int]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = MapProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = su.u_c.deadzone.data.Map.Map(
  )
  implicit class MapLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, su.u_c.deadzone.data.Map.Map]) extends com.trueaccord.lenses.ObjectLens[UpperPB, su.u_c.deadzone.data.Map.Map](_l) {
    def width: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.width)((c_, f_) => c_.copy(width = f_))
    def height: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.height)((c_, f_) => c_.copy(height = f_))
    def tiles: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[Int]] = field(_.tiles)((c_, f_) => c_.copy(tiles = f_))
  }
  final val WIDTH_FIELD_NUMBER = 1
  final val HEIGHT_FIELD_NUMBER = 2
  final val TILES_FIELD_NUMBER = 3
}
